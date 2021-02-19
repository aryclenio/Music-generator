import os
import subprocess

#Teste dos arquivos sintaticamente corretos

for _,_, arquivo in os.walk('./examples/pass'):
    #comando para compilar
    #print(arquivo)
    #call =(["MusicConverter", arquivo])

    #r = subprocess.call(['java ./lib/MusicConverter'])
    #if r == 'Um arquivo JSON foi gerado com sucesso.':
      #  print(arquivo(0) - 'Compilado com sucesso!')
   # else:
     #   print(arquivo(0) - 'Não identificado')
    


#Teste dos arquivos sintaticamente errados

for _,_, arquivo in os.walk('./examples/fail'):
    #comando para compilar
   # call =(["MusicConverter", arquivo])
    #print(arquivo)

    #subprocess.check_output(['java MusicConverter', arquivo])
    #return r
    #if r == 'Um arquivo JSON foi gerado com sucesso.':
     #   print(arquivo(0) - 'Compilado com sucesso!')
    #else:
      #  print(arquivo(0) - 'Não identificado')
