from nis import match
from re import S
from unittest import case
import requests
from datetime import datetime

url = "http://localhost:8080/"

loop = True

while(loop):
    
    print("------MENU------"),
    print("1- Registar novo evento."),
    print("2- Ver lista de eventos numa data."),
    print("3- Listar inscritos num determinado evento."),
    print("4- Inscrever participante num evento."),
    print("5- Ver classificação geral."),
    print("6- Informação da chegada dos participantes num ponto Px"),
    print("7- Sair"),
    print("----------------"),

    print("Insira uma opção: ")
        
    opcao = input()

    if(opcao == '1'):
        
        nome = input("Insira o nome: ")

        data = input("Insira a data desejada (dd-mm-yyyy): ")

        request = { "nome": nome, "data": data}
        response = requests.post(f"{url}eventos",json=request)
    elif(opcao == '2'):

        print("Insira uma data: ")
        data = input()

        response = requests.get(f"{url}eventos/{data}")

        print("")
        print("Eventos:")
        print("")
        for item in response.json():
            print(f"-{item['nome']}")

    elif(opcao == '3'):
        print("Insira o evento: ")
        evento = input()

        response = response = requests.get(f"{url}participantes/{evento}")

        for item in response.json():
            print(" ")
            print(f"Dorsal: {item['dorsal']} | Nome: {item['nome']}")
            print(" ")

    elif(opcao == '4'):

        nome = input("Insira o nome: ")

        genero = input("Insira o género: ")

        escalao = input("Insira o escalão: ")
        
        evento = input("Insira o evento: ")

        request = { "nome": nome, "genero": genero, "escalao": escalao, "evento": evento}

        response = requests.post(f"{url}participantes",json=request)

    elif(opcao == '5'):
        
        response = response = requests.get(f"{url}sensores")

        end = input("Insira um ponto de chegada (p1, p2, p3 ou finish): ")
        
        finished = []
        eventodorsal = []
        for item in response.json():
            print(" ")
            
            if(item[end] != None):
                x = datetime.strptime(item[end], '%Y-%m-%dT%H:%M:%S.%f%z') - datetime.strptime(item['start'], '%Y-%m-%dT%H:%M:%S.%f%z')
                finished.append(x)
                eventodorsal.append(f"Evento: {item['evento']} | Dorsal: {item['dorsal']}")
        
        finishedSorted = sorted(finished)
        print(f"Classificação geral em {end}:")
        for z in range(len(finishedSorted)):
            print (f"Tempo: {finishedSorted[z]} | {eventodorsal[z]}")
            
    elif(opcao == '6'):
        print("Insira uma evento: ")
        evento = input()
        print("Insira um ponto: ")
        ponto = input()
        count = 0

        response = requests.get(f"{url}sensores/{evento}")

        print("")
        
        for item in response.json():
            if(item[ponto] != None):
                count = count + 1
        
        print(f"Passaram {count} pessoas no ponto {ponto} !" )

    elif(opcao == '7'):
        loop = False

    print(" ")
    aux = input("Deseja continuar? (y/n): ")
    if(aux == 'y'):
        continue
    elif(aux == 'n'):
        loop = False 
    else:
        print("Invalid Option")
               