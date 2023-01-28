# Generated by Django 4.1.5 on 2023-01-25 22:17

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='FilmDirector',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('first_name', models.CharField(help_text='Nombre del director', max_length=64)),
                ('last_name', models.CharField(help_text='Apellido del director', max_length=64)),
            ],
        ),
        migrations.CreateModel(
            name='Movie',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(help_text='Nombre de la película', max_length=64)),
                ('description', models.TextField(help_text='Descripción de la película', max_length=320)),
                ('year', models.IntegerField(help_text='Año de la película')),
                ('filmDirector', models.ForeignKey(null=True, on_delete=django.db.models.deletion.SET_NULL, to='movies.filmdirector')),
            ],
        ),
    ]
