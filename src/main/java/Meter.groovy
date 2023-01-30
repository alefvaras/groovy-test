class Meter {

    Number number

    To getTo() {
        new To() {
            @Override
            Number getCentimeter() {
                number * 100

            }
        }

    }
    @Override
    public String toString() {
        "${number} cm"
    }
}
