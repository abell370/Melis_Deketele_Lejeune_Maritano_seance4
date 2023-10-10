function Voiture(couleur) {
    this.marque = "BMW"
    this.couleur = couleur
}

Voiture.prototype.clone = function (voiture) {
    Object.assign(this, voiture)
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

let voitureStandard2 = new Voiture()
voitureStandard2.clone(voitureStandard)

let voitureFamiliale = new Voiture("noire")
voitureFamiliale.packFamilial()

let voitureSportive = new Voiture("jaune")
voitureSportive.packSport()

console.log("Voiture standard : ", voitureStandard);
console.log("Voiture standard n°2 : ", voitureStandard2);
console.log("Voiture familiale : ", voitureFamiliale);
console.log("Voiture sportive : ", voitureSportive);
