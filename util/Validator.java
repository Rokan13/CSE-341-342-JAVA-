package bd.edu.bubt.cse.customException.util;

public class Validator {

    // ================= USERNAME VALIDATION =================

    // ১. প্রথম অক্ষর বর্ণ (A-Z বা a-z) কি না চেক করে
    public static boolean isFirstLetter(String word) {
        return word != null && !word.isEmpty() && Character.isLetter(word.charAt(0));
    }

    // ২. স্পেস (ফাঁকা জায়গা) আছে কি না চেক করে
    public static boolean hasSpace(String word) {
        return word != null && word.contains(" ");
    }

    // ================= PASSWORD VALIDATION =================

    // ৩. সর্বনিম্ন দৈর্ঘ্য (Length) ঠিক আছে কি না চেক করে
    public static boolean hasMinLength(String word, int minLength) {
        return word != null && word.length() >= minLength;
    }

    // ৪. বড় হাতের অক্ষর (A-Z) আছে কি না চেক করে
    public static boolean hasCapital(String word) {
        return word != null && word.matches(".*[A-Z].*");
    }

    // ৫. ছোট হাতের অক্ষর (a-z) আছে কি না চেক করে
    public static boolean hasSmall(String word) {
        return word != null && word.matches(".*[a-z].*");
    }

    // ৬. সংখ্যা (0-9) আছে কি না চেক করে
    public static boolean hasDigit(String word) {
        return word != null && word.matches(".*[0-9].*");
    }

    // ৭. স্পেশাল ক্যারেক্টার (@, #, $, % ইত্যাদি) আছে কি না চেক করে
    public static boolean hasSpecial(String word) {
        return word != null && word.matches(".*[^a-zA-Z0-9\\s].*");
    }
}