
import pandas as pd
import numpy as np
d = pd.read_csv("F:/Kaviyarasan M.Sc ML/weather12.csv")
print(d)
a = np.array(d)[:,:-1]
print ("The attributes are ",a)
t= np.array(d)[:,-1]
print ("the target is :",t)
def train(c,t):
    for i, val in enumerate(t):
     if val == "yes":
       specific_hypothesis = c[i].copy()
     break
    for i,val in enumerate(c):
     if t[i]=="yes":
      for x in range(len(specific_hypothesis)):
         if val [x] != specific_hypothesis[x]:
          specific_hypothesis[x] ='?'
    else:
     pass
    return specific_hypothesis  
print(" The final hypothsis is:",train(a,t))   
                