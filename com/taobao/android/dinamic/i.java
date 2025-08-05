package com.taobao.android.dinamic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.CompatibleView;
import com.taobao.android.dinamic.view.a;
import tb.fpa;
import tb.fpd;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends LayoutInflater {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fpd f11751a;

    static {
        kge.a(62894759);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public i(LayoutInflater layoutInflater, Context context) {
        super(layoutInflater, context);
    }

    public static i a(Context context, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("66821f99", new Object[]{context, fpdVar});
        }
        i iVar = new i(LayoutInflater.from(context), context);
        iVar.a(fpdVar);
        return iVar;
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
        }
        if (e.b(str) != null) {
            try {
                return k.a(str, getContext(), attributeSet, this.f11751a);
            } catch (Throwable th) {
                this.f11751a.c().b().a(a.ERROR_CODE_VIEW_EXCEPTION, str);
                fpa.b("DinamicInflater", th, "onCreateView failed");
                return a(a.ERROR_CODE_VIEW_EXCEPTION, str);
            }
        }
        this.f11751a.c().b().a(a.ERROR_CODE_VIEW_NOT_FOUND, str);
        return a(a.ERROR_CODE_VIEW_NOT_FOUND, str);
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context}) : from(context);
    }

    public void a(fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fbfbbe", new Object[]{this, fpdVar});
        } else {
            this.f11751a = fpdVar;
        }
    }

    private CompatibleView a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompatibleView) ipChange.ipc$dispatch("67161099", new Object[]{this, str, str2});
        }
        Context context = getContext();
        return new CompatibleView(context, str2 + str);
    }
}
