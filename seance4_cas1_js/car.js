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
voitureStandard.packStandard()

let voitureFamiliale = new Voiture("noire")
voitureFamiliale.packFamilial()

let voitureSportive = new Voiture("jaune")
voitureSportive.packSport()

console.log("Voiture standard : ", voitureStandard);
console.log("Voiture familiale : ", voitureFamiliale);
console.log("Voiture sportive : ", voitureSportive);
