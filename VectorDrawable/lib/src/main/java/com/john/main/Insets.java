package com.john.main;

import android.graphics.Rect;

public class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int left;
    public final int top;
    public final int right;
    public final int bottom;
    private Insets(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }
    // Factory methods
    /**
     * Return an Insets instance with the appropriate values.
     *
     * @param left the left inset
     * @param top the top inset
     * @param right the right inset
     * @param bottom the bottom inset
     *
     * @return Insets instance with the appropriate values
     */
    public static Insets of(int left, int top, int right, int bottom) {
        if (left == 0 && top == 0 && right == 0 && bottom == 0) {
            return NONE;
        }
        return new Insets(left, top, right, bottom);
    }
    /**
     * Return an Insets instance with the appropriate values.
     *
     * @param r the rectangle from which to take the values
     *
     * @return an Insets instance with the appropriate values
     */
    public static Insets of(Rect r) {
        return (r == null) ? NONE : of(r.left, r.top, r.right, r.bottom);
    }
    /**
     * Two Insets instances are equal iff they belong to the same class and their fields are
     * pairwise equal.
     *
     * @param o the object to compare this instance with.
     *
     * @return true iff this object is equal {@code o}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insets insets = (Insets) o;
        if (bottom != insets.bottom) return false;
        if (left != insets.left) return false;
        if (right != insets.right) return false;
        if (top != insets.top) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = left;
        result = 31 * result + top;
        result = 31 * result + right;
        result = 31 * result + bottom;
        return result;
    }
    @Override
    public String toString() {
        return "Insets{" +
                "left=" + left +
                ", top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                '}';
    }
}