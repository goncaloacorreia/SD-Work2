package runningevents2;

class EventoNotFoundException extends RuntimeException {

  EventoNotFoundException(Long id) {
    super("Could not find evento " + id);
  }
}
