package tb;

import android.content.Intent;

/* loaded from: classes.dex */
public interface llb {

    /* renamed from: tb.llb$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static void $default$onActivityResult(llb llbVar, int i, int i2, Intent intent) {
        }

        public static void $default$onColdStartResume(llb llbVar) {
        }
    }

    void onActivityResult(int i, int i2, Intent intent);

    void onColdStartResume();

    void onDestroy();

    void onDestroyView();

    void onNewIntent(Intent intent);

    void onPause();

    void onRestart();

    void onResume();

    void onStart();

    void onStop();

    void onWillExit();
}
