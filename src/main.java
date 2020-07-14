//fasada troche jak interface uzytkownika - nie musi wiedziec co jest podspodem. Stosowane dla bezpieczenstwa.
//prosty wrzocec - dlaschowania kodu przed klientem lub uproscic dla klienta
//zalety: bezpieczenstwo,
//wady: zalezna od class - jesli modyfikujemy classy, trzeba tez fasade


import deliveryBox.DeliveryBoxFacade;

public class main {
    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }
}

