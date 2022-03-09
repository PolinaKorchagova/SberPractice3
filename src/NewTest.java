public class NewTest {
    public static void main(String[] args){
        BankOnline bankOnline = new BankOnline();
        BankOnline card = new BankOnline();
        try{
            bankOnline.send("1234567812345678", 1000.00);
            card.send("1234567812345678", 30000.21);
        } catch (InvalidCardNumberException exception){
            System.err.println("Проверьте правильность ввода карты");
        } catch (BlockCardsException exception){
            System.err.println("Невозможен перевод на заблокированную карту");
        } catch (NegativeSummaException exception){
            System.err.println("Введена отрицательная сумма перевода");
        } catch (LimitMoneyException exception){
            System.err.println("Превышен лимит в 50 000");
        } catch (NullArgException exception){
            System.err.println("Поле номер карты пусто или сумма перевода равна нулю");
        }
    }
}