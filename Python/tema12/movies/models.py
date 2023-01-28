from django.db import models

# Create your models here.
class Movie(models.Model):
    name = models.CharField(max_length=64, help_text='Nombre de la película')
    filmDirector = models.ForeignKey('FilmDirector', on_delete=models.SET_NULL, null=True)
    description = models.TextField(max_length=320, help_text='Descripción de la película')
    year = models.IntegerField(help_text='Año de la película')

    def __str__(self):
        return self.name


class FilmDirector(models.Model):
    first_name = models.CharField(max_length=64, help_text='Nombre del director')
    last_name = models.CharField(max_length=64, help_text='Apellido del director')
    
    def __str__(self):
        return self.first_name + ' ' + self.last_name