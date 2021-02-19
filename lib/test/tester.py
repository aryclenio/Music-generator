import os

#Teste dos arquivos sintaticamente corretos

for _,_, arquivo in os.walk('./examples/pass'):
    #comando para compilar
    print(arquivo)


#Teste dos arquivos sintaticamente errados

for _,_, arquivo in os.walk('./examples/fail'):
    #comando para compilar
    print(arquivo)
