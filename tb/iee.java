package tb;

import android.util.Log;
import java.util.Arrays;
import tb.mto;

/* loaded from: classes2.dex */
public class iee {

    /* renamed from: a  reason: collision with root package name */
    static iee f28961a = new iee();
    public static String[] c = {"standard", "accelerate", "decelerate", "linear"};
    String b = "identity";

    /* loaded from: classes2.dex */
    static class a extends iee {
        private static double h = 0.01d;
        private static double i = 1.0E-4d;
        double d;
        double e;
        double f;
        double g;

        a(String str) {
            this.b = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i2);
            this.e = Double.parseDouble(str.substring(i2, indexOf3).trim());
            int i3 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i3);
            this.f = Double.parseDouble(str.substring(i3, indexOf4).trim());
            int i4 = indexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        private double c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.d * d2 * d3 * d) + (this.f * d3 * d * d) + (d * d * d);
        }

        private double d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.e * d2 * d3 * d) + (this.g * d3 * d * d) + (d * d * d);
        }

        @Override // tb.iee
        public double a(double d) {
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                return mto.a.GEO_NOT_SUPPORT;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > h) {
                d2 *= 0.5d;
                d3 = c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double c = c(d4);
            double d5 = d3 + d2;
            double c2 = c(d5);
            double d6 = d(d4);
            return (((d(d5) - d6) * (d - c)) / (c2 - c)) + d6;
        }

        @Override // tb.iee
        public double b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > i) {
                d2 *= 0.5d;
                d3 = c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (d(d5) - d(d4)) / (c(d5) - c(d4));
        }
    }

    public static iee a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 0;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return new a("cubic(0.4, 0.0, 0.2, 1)");
        }
        if (c2 == 1) {
            return new a("cubic(0.4, 0.05, 0.8, 0.7)");
        }
        if (c2 == 2) {
            return new a("cubic(0.0, 0.0, 0.2, 0.95)");
        }
        if (c2 == 3) {
            return new a("cubic(1, 1, 0, 0)");
        }
        Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(c));
        return f28961a;
    }

    public double a(double d) {
        return d;
    }

    public double b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.b;
    }
}
