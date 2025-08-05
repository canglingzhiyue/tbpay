package com.taobao.android.tucaoba;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sfj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/tucaoba/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", i.b.MEASURE_ONCREATE, "", "savedInstanceState", "Landroid/os/Bundle;", "tucaoba-android_debug"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class MainActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1293787003);
    }

    public static /* synthetic */ Object ipc$super(MainActivity mainActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_counter", 1.0d);
        sfj sfjVar = sfj.INSTANCE;
        Intent intent = getIntent();
        q.b(intent, "intent");
        if (sfjVar.a(intent)) {
            AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_h5_direct_counter", 1.0d);
            sfj sfjVar2 = sfj.INSTANCE;
            Context applicationContext = getApplicationContext();
            q.b(applicationContext, "applicationContext");
            Intent intent2 = getIntent();
            q.b(intent2, "intent");
            sfjVar2.a(applicationContext, intent2);
        } else {
            sfj sfjVar3 = sfj.INSTANCE;
            Context applicationContext2 = getApplicationContext();
            q.b(applicationContext2, "applicationContext");
            if (sfjVar3.b(applicationContext2)) {
                AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_feature_counter", 1.0d);
                Intent intent3 = getIntent();
                q.b(intent3, "intent");
                sfj.INSTANCE.b(this, intent3);
            } else {
                AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_h5_counter", 1.0d);
                sfj sfjVar4 = sfj.INSTANCE;
                Context applicationContext3 = getApplicationContext();
                q.b(applicationContext3, "applicationContext");
                Intent intent4 = getIntent();
                q.b(intent4, "intent");
                sfjVar4.a(applicationContext3, intent4);
            }
        }
        finish();
    }
}
