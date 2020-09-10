# -*- coding: utf-8 -*-
"""
Created on Wed Sep  9 23:22:35 2020

@author: gabriel
"""

import numpy as np
import numpy.random as rnd

arreglo = rnd.randint(0,9,200)
suma = 0

print("El arreglo original es así")
print(arreglo)
print(" \nLos números pares del arreglo son :")

for i in range(len(arreglo)):    
    if(arreglo[i]%2 == 0 and arreglo[i] != 0):      
        print (arreglo[i], end= " ")        
    suma =  suma + arreglo[i]     

promedio = suma/len(arreglo)
print("\nEl promedio es: {}".format(promedio))

print("\nEl arreglo invertido es así ")
for n in reversed (range (len(arreglo))):
    print(arreglo[n], end=" ")
    