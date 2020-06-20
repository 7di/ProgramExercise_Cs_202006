package com.twschool.practice;

public enum Move {
N {
    @Override
    public Move northmovement() {

        return null;
    }

    @Override
    public Move southmovement() {
        return null;
    }

    @Override
    public Move eastmovement() {
        return null;
    }

    @Override
    public Move westmovement() {
        return null;
    }
},S {
        @Override
        public Move northmovement() {
            return null;
        }

        @Override
        public Move southmovement() {
            return null;
        }

        @Override
        public Move eastmovement() {
            return null;
        }

        @Override
        public Move westmovement() {
            return null;
        }
    },W {
        @Override
        public Move northmovement() {
            return null;
        }

        @Override
        public Move southmovement() {
            return null;
        }

        @Override
        public Move eastmovement() {
            return null;
        }

        @Override
        public Move westmovement() {
            return null;
        }
    },E {
        @Override
        public Move northmovement() {
            return null;
        }

        @Override
        public Move southmovement() {
            return null;
        }

        @Override
        public Move eastmovement() {
            return null;
        }

        @Override
        public Move westmovement() {
            return null;
        }
    };
    public abstract Move northmovement();
    public abstract Move southmovement();
    public abstract Move eastmovement();
    public abstract Move westmovement();
}
