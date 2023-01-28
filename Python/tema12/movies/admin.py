from django.contrib import admin

# Register your models here.
from .models import FilmDirector, Movie

admin.site.register(FilmDirector)
admin.site.register(Movie)