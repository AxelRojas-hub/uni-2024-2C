from Serie import Serie
from Categoria import Categoria

serie = Serie("imagen", "breaking bad", "Estrena todos los jueves")
serie1 = Serie("imagen", "game of thrones", "Estrena todos los jueves")
serie2 = Serie("imagen", "Morty", "Estrena todos los jueves")

categoria = Categoria ("Estreno semanal")
categoria.agregar_serie(Serie)