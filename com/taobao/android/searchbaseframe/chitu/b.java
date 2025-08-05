package com.taobao.android.searchbaseframe.chitu;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.e;
import com.taobao.weex.common.Constants;
import tb.imn;
import tb.iul;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends ius<Void, ImageView, Void> implements e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f14957a;
    private boolean b;

    static {
        kge.a(444020401);
        kge.a(41879995);
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "ChiTuWidget";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.ImageView, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ ImageView onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public b(Activity activity, ium iumVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, null, viewGroup, iurVar);
        this.b = false;
        if (c().l().a() || c().l().d()) {
            this.f14957a = new e(this, c());
            this.f14957a.a(this);
            this.f14957a.a(activity, c().n().c);
        }
    }

    public ImageView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("3a195828", new Object[]{this});
        }
        e eVar = this.f14957a;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    @Override // com.taobao.android.searchbaseframe.chitu.e.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            attachToContainer();
        }
    }

    @Override // com.taobao.android.searchbaseframe.chitu.e.a
    public void d() {
        if (!this.b) {
            this.b = true;
            try {
                Class.forName("com.taobao.android.xsearchplugin.debugger.XSDebuggerTool").getDeclaredMethod(Constants.Event.SLOT_LIFECYCLE.ATTACH, iul.class).invoke(null, getRoot());
            } catch (Throwable unused) {
                c().b().b("XSDebuggerTool", "no debugger");
            }
        }
        ((ImageView) getView()).post(new Runnable() { // from class: com.taobao.android.searchbaseframe.chitu.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Class.forName("com.taobao.android.xsearchplugin.debugger.XSDebuggerTool").getDeclaredMethod("pop", iul.class).invoke(null, b.this.getRoot());
                } catch (Throwable unused2) {
                    b.this.c().b().b("XSDebuggerTool", "no debugger");
                }
            }
        });
    }

    @Override // com.taobao.android.searchbaseframe.chitu.e.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        iur setter = getSetter();
        if (setter == null) {
            return;
        }
        setter.a(view);
    }

    public static void a(imn imnVar, Activity activity, String str, String str2, String str3) {
        try {
            Class.forName("com.taobao.android.xsearchplugin.debugger.codeview.XSDCodeView").getDeclaredMethod("attachToActivity", imn.class, Activity.class, com.taobao.android.xsearchplugin.debugger.protocal.a.class).invoke(null, imnVar, activity, new com.taobao.android.xsearchplugin.debugger.protocal.a(str, str2, str3));
        } catch (Throwable th) {
            imnVar.b().b("XSDebuggerTool", "no source view", th);
        }
    }
}
