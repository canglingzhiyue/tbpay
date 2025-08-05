package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/* loaded from: classes2.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // android.support.v4.app.DialogFragment
    /* renamed from: onCreateDialog */
    public Dialog mo1438onCreateDialog(Bundle bundle) {
        return new h(getContext(), getTheme());
    }

    @Override // android.support.v4.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof h)) {
            super.setupDialog(dialog, i);
            return;
        }
        h hVar = (h) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        hVar.supportRequestWindowFeature(1);
    }
}
