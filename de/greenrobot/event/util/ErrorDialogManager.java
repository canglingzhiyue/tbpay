package de.greenrobot.event.util;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/* loaded from: classes9.dex */
public class ErrorDialogManager {
    public static final String KEY_EVENT_TYPE_ON_CLOSE = "de.greenrobot.eventbus.errordialog.event_type_on_close";
    public static final String KEY_FINISH_AFTER_DIALOG = "de.greenrobot.eventbus.errordialog.finish_after_dialog";
    public static final String KEY_ICON_ID = "de.greenrobot.eventbus.errordialog.icon_id";
    public static final String KEY_MESSAGE = "de.greenrobot.eventbus.errordialog.message";
    public static final String KEY_TITLE = "de.greenrobot.eventbus.errordialog.title";

    /* renamed from: a  reason: collision with root package name */
    public static b<?> f24782a;

    /* loaded from: classes9.dex */
    public static class HoneycombManagerFragment extends Fragment {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f24783a;
        protected Bundle b;
        private de.greenrobot.event.c c;
        private Object d;

        public void onEventMainThread(d dVar) {
            if (!ErrorDialogManager.b(this.d, dVar)) {
                return;
            }
            ErrorDialogManager.a(dVar);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            DialogFragment dialogFragment2 = (DialogFragment) ErrorDialogManager.f24782a.a(dVar, this.f24783a, this.b);
            if (dialogFragment2 == null) {
                return;
            }
            dialogFragment2.show(fragmentManager, "de.greenrobot.eventbus.error_dialog");
        }

        @Override // android.app.Fragment
        public void onPause() {
            this.c.c(this);
            super.onPause();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            this.c = ErrorDialogManager.f24782a.f24785a.a();
            this.c.a(this);
        }
    }

    /* loaded from: classes9.dex */
    public static class SupportManagerFragment extends android.support.v4.app.Fragment {
        protected Bundle argumentsForErrorDialog;
        private de.greenrobot.event.c eventBus;
        private Object executionScope;
        protected boolean finishAfterDialog;
        private boolean skipRegisterOnNextResume;

        public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
            android.support.v4.app.FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            SupportManagerFragment supportManagerFragment = (SupportManagerFragment) supportFragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog_manager");
            if (supportManagerFragment == null) {
                supportManagerFragment = new SupportManagerFragment();
                supportFragmentManager.beginTransaction().add(supportManagerFragment, "de.greenrobot.eventbus.error_dialog_manager").commit();
                supportFragmentManager.executePendingTransactions();
            }
            supportManagerFragment.finishAfterDialog = z;
            supportManagerFragment.argumentsForErrorDialog = bundle;
            supportManagerFragment.executionScope = obj;
        }

        @Override // android.support.v4.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.eventBus = ErrorDialogManager.f24782a.f24785a.a();
            this.eventBus.a(this);
            this.skipRegisterOnNextResume = true;
        }

        public void onEventMainThread(d dVar) {
            if (!ErrorDialogManager.b(this.executionScope, dVar)) {
                return;
            }
            ErrorDialogManager.a(dVar);
            android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            android.support.v4.app.DialogFragment dialogFragment = (android.support.v4.app.DialogFragment) fragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            android.support.v4.app.DialogFragment dialogFragment2 = (android.support.v4.app.DialogFragment) ErrorDialogManager.f24782a.a(dVar, this.finishAfterDialog, this.argumentsForErrorDialog);
            if (dialogFragment2 == null) {
                return;
            }
            dialogFragment2.show(fragmentManager, "de.greenrobot.eventbus.error_dialog");
        }

        @Override // android.support.v4.app.Fragment
        public void onPause() {
            this.eventBus.c(this);
            super.onPause();
        }

        @Override // android.support.v4.app.Fragment
        public void onResume() {
            super.onResume();
            if (this.skipRegisterOnNextResume) {
                this.skipRegisterOnNextResume = false;
                return;
            }
            this.eventBus = ErrorDialogManager.f24782a.f24785a.a();
            this.eventBus.a(this);
        }
    }

    protected static void a(d dVar) {
        if (!f24782a.f24785a.f || f24782a.f24785a.g != null) {
            return;
        }
        String str = de.greenrobot.event.c.f24768a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Object obj, d dVar) {
        Object b;
        return dVar == null || (b = dVar.b()) == null || b.equals(obj);
    }
}
