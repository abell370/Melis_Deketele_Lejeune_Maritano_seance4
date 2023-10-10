function Voiture(couleur) {
    this.marque = "BMW"
    this.couleur = couleur
}

Voiture.prototype.packStandard = function () {
    this.radio = true
    this.telephone = true
}

Voiture.prototype.packFamilial = function () {
    this.siegeEnfant = true
    this.miroirs = true
}

Voiture.prototype.packSport = function () {
    this.suspension = true
    this.jantes = true
}

let voitureStandard = new Voiture("bleu")
let voitureFamiliale = new Voiture("noire")
let voitureSportive = new Voiture("jaune")

voitureStandard.packStandard()
voitureFamiliale.packFamilial()
voitureSportive.packSport()

console.log("Voiture standard : ", voitureStandard);
console.log("Voiture familiale : ", voitureFamiliale);
console.log("Voiture sportive : ", voitureSportive);

let voitureFamiliale2 = new Voiture("rouge")
voitureFamiliale2.packFamilial();
console.log(voitureFamiliale2);