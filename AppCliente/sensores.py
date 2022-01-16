from nis import match
from re import S
from unittest import case
import requests
from datetime import datetime



url = "http://localhost:8080/"

loop = True

while(loop):
    dorsal = input("Insira a dorsal: ")
    
    evento = input("Insira o evento: ")

    start = input("Insira o tempo de partida: ")
    start_parse = datetime.strptime(start, '%Y-%m-%dT%H:%M:%S.%f%z')

    p1 = input("Insira o tempo do primeiro ponto intermédio: ")
    p1_parse = datetime.strptime(p1, '%Y-%m-%dT%H:%M:%S.%f%z')

    p2 = input("Insira o tempo do segundo ponto intermédio: ")
    p2_parse = datetime.strptime(p2, '%Y-%m-%dT%H:%M:%S.%f%z')

    p3 = input("Insira o tempo do terceiro ponto intermédio: ")
    p3_parse = datetime.strptime(p3, '%Y-%m-%dT%H:%M:%S.%f%z')

    finish = input("Insira o tempo de chegada: ")
    finish_parse = datetime.strptime(finish, '%Y-%m-%dT%H:%M:%S.%f%z')

    request = { "dorsal": dorsal, "evento": evento, "start": start_parse, "p1": p1_parse, "p2": p2_parse, "p3": p3_parse, "finish": finish_parse }
    response = requests.post(f"{url}sensores",json=request)

    
    
    

    print(" ")
    aux = input("Deseja continuar? (y/n): ")
    if(aux == 'y'):
        continue
    elif(aux == 'n'):
        loop = False 
    else:
        print("Invalid Option")