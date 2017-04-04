package com.example.yesorno;

    public class Brainteaser {
        private String name;
        private int brainteaserCategoryId;
        private String description;
        private String answer;

        public static Brainteaser[][] brainteasers = new Brainteaser[][]{
                {
                        new Brainteaser(1, "Роковая обезьянка", "Пять человек погибли из-за игрушечной обезьянки. Как такое произошло?", "Они ехали в легковой машине, на стекле которой болталась игрушечная обезьянка. Из-за этой обезьянки водитель не успел заметить выехавший из-за поворота грузовик."),
                        new Brainteaser(1, "Деревенский дурачок", "Люди, приезжавшие в живописную горную деревушку, часто удивлялись местному дурачку. Когда ему предлагали выбор между блестящей 50-центовой монетой и мятой пятидолларовой купюрой, он всегда выбирал монету, хотя она стоит вдесятеро меньше купюры. Почему он никогда не выбирал купюру?", "«Дурачок» был не так глуп: он понимал, что, пока он будет выбирать 50-центовую монету, люди будут предлагать ему выбор, а если он выберет пятидолларовую купюру, предложения выбора прекратятся, и он не будет получать ничего."),
                        new Brainteaser(1, "New brainteaser 3", "Someone description 3", "answer"),
                        new Brainteaser(1, "New brainteaser 4", "Someone description 4", "answer"),
                        new Brainteaser(1, "New brainteaser 5", "Someone description 5", "answer"),
                        new Brainteaser(1, "New brainteaser 6", "Someone description 6", "answer"),
                        new Brainteaser(1, "New brainteaser 7", "Someone description 7", "answer"),
                        new Brainteaser(1, "New brainteaser 8", "Someone description 8", "answer"),
                        new Brainteaser(1, "New brainteaser 9", "Someone description 9", "answer")
                },
                {
                        new Brainteaser(1, "New brainteaser 21", "Someone description 1", "answer"),
                        new Brainteaser(1, "New brainteaser 22", "Someone description 2", "answer"),
                        new Brainteaser(1, "New brainteaser 23", "Someone description 3", "answer"),
                        new Brainteaser(1, "New brainteaser 24", "Someone description 4", "answer"),
                        new Brainteaser(1, "New brainteaser 25", "Someone description 5", "answer"),
                        new Brainteaser(1, "New brainteaser 26", "Someone description 6", "answer"),
                        new Brainteaser(1, "New brainteaser 27", "Someone description 7", "answer"),
                        new Brainteaser(1, "New brainteaser 28", "Someone description 8", "answer"),
                        new Brainteaser(1, "New brainteaser 29", "Someone description 9", "answer")
                },
                {
                        new Brainteaser(1, "New brainteaser 31", "Someone description 1", "answer"),
                        new Brainteaser(1, "New brainteaser 32", "Someone description 2", "answer"),
                        new Brainteaser(1, "New brainteaser 33", "Someone description 3", "answer"),
                        new Brainteaser(1, "New brainteaser 34", "Someone description 4", "answer"),
                        new Brainteaser(1, "New brainteaser 35", "Someone description 5", "answer"),
                        new Brainteaser(1, "New brainteaser 36", "Someone description 6", "answer"),
                        new Brainteaser(1, "New brainteaser 37", "Someone description 7", "answer"),
                        new Brainteaser(1, "New brainteaser 38", "Someone description 8", "answer"),
                        new Brainteaser(1, "New brainteaser 39", "Someone description 9", "answer")
                },
                {
                        new Brainteaser(1, "New brainteaser 41", "Someone description 1", "answer"),
                        new Brainteaser(1, "New brainteaser 42", "Someone description 2", "answer"),
                        new Brainteaser(1, "New brainteaser 43", "Someone description 3", "answer"),
                        new Brainteaser(1, "New brainteaser 44", "Someone description 4", "answer"),
                        new Brainteaser(1, "New brainteaser 45", "Someone description 5", "answer"),
                        new Brainteaser(1, "New brainteaser 46", "Someone description 6", "answer"),
                        new Brainteaser(1, "New brainteaser 47", "Someone description 7", "answer"),
                        new Brainteaser(1, "New brainteaser 48", "Someone description 8", "answer"),
                        new Brainteaser(1, "New brainteaser 49", "Someone description 9", "answer")
                },
                {
                        new Brainteaser(1, "New brainteaser 51", "Someone description 1", "answer"),
                        new Brainteaser(1, "New brainteaser 52", "Someone description 2", "answer"),
                        new Brainteaser(1, "New brainteaser 53", "Someone description 3", "answer"),
                        new Brainteaser(1, "New brainteaser 54", "Someone description 4", "answer"),
                        new Brainteaser(1, "New brainteaser 55", "Someone description 5", "answer"),
                        new Brainteaser(1, "New brainteaser 56", "Someone description 6", "answer"),
                        new Brainteaser(1, "New brainteaser 57", "Someone description 7", "answer"),
                        new Brainteaser(1, "New brainteaser 58", "Someone description 8", "answer"),
                        new Brainteaser(1, "New brainteaser 59", "Someone description 9", "answer")
                }
        };

    public Brainteaser(int brainteaserCategoryId, String name, String description, String answer ) {
        this.brainteaserCategoryId = brainteaserCategoryId;
        this.name = name;
        this.description = description;
        this.answer = answer;
    }

    public void setBrainteaserCategoryId(int brainteaserCategoryId) {
        this.brainteaserCategoryId = brainteaserCategoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBrainteaserCategoryId() {
        return brainteaserCategoryId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAnswer() {
        return answer;
    }
}
