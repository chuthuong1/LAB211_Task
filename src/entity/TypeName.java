/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TNO
 */
public enum TypeName {
    Code, Test, Design, Review;

    @Override
    public String toString() {
        switch (this) {
            case Code:
                return "Code";
            case Test:
                return "Test";
            case Design:
                return "Design";
            case Review:
                return "Review";
           default:
                throw new UnsupportedOperationException();

        }
    }

}
