from django.shortcuts import render

# Create your views here.
from. models import FilmDirector, Movie

def get_movies_list(movies):
    new_movies = []

    for movie in movies:
        new_movies.append(movie)

    return new_movies

def get_film_directors_list(film_directors):
    new_film_directors = []

    for film_director in film_directors:
        new_film_directors.append(film_director)

    return new_film_directors

def index(request):
    num_movies = Movie.objects.all().count()
    num_film_directors = FilmDirector.objects.all().count()
    qs_all_movies = Movie.objects.values_list()
    qs_all_film_directors = FilmDirector.objects.values_list()
    all_movies = get_movies_list(qs_all_movies)
    all_film_directors = get_film_directors_list(qs_all_film_directors)

    return render(
        request,
        'index.html',
        context={
            'num_movies': num_movies,
            'num_film_directors': num_film_directors,
            'all_movies': all_movies,
            'all_film_directors': all_film_directors

        }
    )