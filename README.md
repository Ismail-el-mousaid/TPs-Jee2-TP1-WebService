# TPs-Jee2-TP1-WebService

Après la crétion du nouveau project java 8 (version stable), on commance par la crétion du classe Compte dans la couche métier.


Et après on crée la classe BanqueService, dont lequel on déclare les méthodes suivantes:
	-conversion(): permet de transformer DH en EURO
	-getCompte(): retourne le compte 
	-listComptes(): permet de lister les comptes

Après la création du web service, il faut le déployer:
	Tout d'abbord on créer un serveur en créant la classe ServeurJaxWS.

Et après, on voit que le web service deployé sur http://localhost:8686/BanqueWS?wsdl

Maintenant on commence a consommer le web service par client java:
  Pour cela on doit créer un new project et aller dans tools -> web service -> generate java code from wsdl
  et donner le lien de déploiement, ce qui result la géneration du proxy (cad va génerer les interfaces & les classes)
  et après on doit consommer ce proxy.

Et après on créer un client .NET.


Et un client PHP.
