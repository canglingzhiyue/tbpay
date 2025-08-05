package android.support.constraint.solver.state;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ConstraintReference {

    /* loaded from: classes2.dex */
    class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }
}
