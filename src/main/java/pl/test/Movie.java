    package pl.test;

    public class Movie {
        private String tytul;
        private String czasTrwania;
        private  int ograniczenieWiekowe;

        public Movie(String tytul, String czasTrwania, int ograniczenieWiekowe) {
            if (tytul.isEmpty() || czasTrwania.isEmpty())
                throw new IllegalArgumentException("Wszyskie dane filmu powinny buć uzupełnione!");

            this.tytul = tytul;
            this.czasTrwania = czasTrwania;
            this.ograniczenieWiekowe = ograniczenieWiekowe;
        }

        public String getTytul() {
            return tytul;
        }

        public String getCzasTrwania() {
            return czasTrwania;
        }

        @Override
        public String toString() {
            return "Film{" +
                    "\ntytul='" + tytul + '\'' +
                    "\n, czas Trwania='" + czasTrwania + '\'' +
                    "\n, ograniczenieWiekowe=" + ograniczenieWiekowe +
                    "\n}";
        }

        public int getOgraniczenieWiekowe() {
            return ograniczenieWiekowe;
        }
    }
