package com.taobao.android.live.plugin.atype.flexalocal.clean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.pmd;

/* loaded from: classes5.dex */
public class a extends Dialog implements DialogInterface.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f13600a;
    private Context b;

    static {
        kge.a(1880638941);
        kge.a(908767350);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7ad0002", new Object[]{aVar}) : aVar.b;
    }

    public a(Context context) {
        super(context, R.style.TLLive_Permission_Dialog_AType);
        this.f13600a = new Handler();
        this.b = context;
        setContentView(R.layout.taolive_clear_screen_guide_layout_flexalocal);
        setOnDismissListener(this);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        findViewById(R.id.root).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.clean.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.this.dismiss();
                }
            }
        });
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_guide);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setImageUrl(a());
        ((TextView) findViewById(R.id.taolive_text)).setText("信息太多？点击进入清屏");
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.f13600a.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.clean.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!(a.a(a.this) instanceof Activity) || ((Activity) a.a(a.this)).isDestroyed()) {
                } else {
                    a.this.dismiss();
                }
            }
        }, b());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        } else {
            this.f13600a.removeCallbacksAndMessages(null);
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : pmd.a().d().a("tblive", "swipeClickScreenIcon", "https://img.alicdn.com/imgextra/i4/O1CN01r13ORS1WJKhb6NoB1_!!6000000002767-54-tps-360-360.apng");
    }

    private static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : l.c(pmd.a().d().a("tblive", "cleanScreenGuideRemoveDelayTime", "5")) * 1000.0f;
    }
}
