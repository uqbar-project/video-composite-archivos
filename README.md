
# Ejercicio File System Archivos - Composite

[![build](https://github.com/uqbar-project/video-composite-archivos/actions/workflows/build.yml/badge.svg)](https://github.com/uqbar-project/video-composite-archivos/actions/workflows/build.yml) [![build](https://github.com/uqbar-project/video-composite-archivos/actions/workflows/build.yml/badge.svg)](https://github.com/uqbar-project/video-composite-archivos/actions/workflows/build.yml) 

Ejercicio base para el video que explica el patrón Composite mediante el ejemplo del File System (archivos).

## Dominio

Dada una estructura de archivos y directorios, queremos saber:

- el tamaño de un elemento
  - un archivo tiene el tamaño definido
  - un directorio tiene el tamaño de todos los archivos contenidos en él y en sus subdirectorios

- si un elemento es grande
  - un archivo es grande si pesa más de 5 MB
  - un directorio es grande si tiene más de 2 elementos (sean archivos o directorios) o tiene un tamaño de más de  10 MB
