package com.taobao.infoflow.core.engine.env.protocol;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import tb.dqa;

/* loaded from: classes.dex */
public interface h {

    /* loaded from: classes7.dex */
    public interface a {

        /* renamed from: com.taobao.infoflow.core.engine.env.protocol.h$a$-CC  reason: invalid class name */
        /* loaded from: classes7.dex */
        public final /* synthetic */ class CC {
            public static int $default$c(a aVar) {
                return 0;
            }

            public static Fragment $default$d(a aVar) {
                return null;
            }

            public static boolean $default$e(a aVar) {
                return false;
            }
        }

        Bundle a();

        Bundle b();

        int c();

        Fragment d();

        boolean e();
    }

    /* loaded from: classes7.dex */
    public interface b {
        String onIntercept(String str);
    }

    boolean a(Context context, a aVar, String str, View view, dqa dqaVar);

    boolean a(Context context, a aVar, String str, View view, boolean z);

    boolean a(Context context, String str);
}
