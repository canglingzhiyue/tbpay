package com.taobao.themis.taobao.impl;

import android.app.Activity;
import android.taobao.windvane.extra.jsbridge.WVApplication;
import android.taobao.windvane.jsbridge.WVH5PP;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.jsbridge.ScancodeCallback;
import com.taobao.browser.jsbridge.TBWVDialog;
import com.taobao.browser.jsbridge.TBWVSecurity;
import com.taobao.browser.jsbridge.TBWeakNetStatus;
import com.taobao.browser.jsbridge.WVCameraPlus;
import com.taobao.browser.jsbridge.WVClient;
import com.taobao.browser.jsbridge.WVLocationProxy;
import com.taobao.browser.jsbridge.WVTBLocation;
import com.taobao.browser.jsbridge.WVUICityList;
import com.taobao.browser.jsbridge.WVUIImagepreview;
import com.taobao.browser.jsbridge.WebAppInterface;
import com.taobao.themis.inside.adapter.DefaultWebAdapter;
import com.taobao.themis.kernel.extension.page.r;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tmg;
import tb.tmi;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/taobao/impl/TBWebAdapter;", "Lcom/taobao/themis/inside/adapter/DefaultWebAdapter;", "()V", "sApiRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_PERMISSION_CHECK, "", "bizType", "", "url", "registerPlugins", "", "shouldOverrideUrlLoading", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TBWebAdapter extends DefaultWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f22855a = new AtomicBoolean(false);

    static {
        kge.a(1656215661);
    }

    public static /* synthetic */ Object ipc$super(TBWebAdapter tBWebAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.adapter.DefaultWebAdapter
    public boolean shouldOverrideUrlLoading(ITMSPage page, String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edbe04c", new Object[]{this, page, url})).booleanValue();
        }
        q.d(page, "page");
        q.d(url, "url");
        r rVar = (r) page.a(r.class);
        if (rVar != null) {
            rVar.a();
        }
        com.taobao.themis.web.runtime.a aVar = (com.taobao.themis.web.runtime.a) page.a(com.taobao.themis.web.runtime.a.class);
        tmg a2 = aVar != null ? aVar.a() : null;
        Activity context = page.b().o();
        if (a2 != null && a(a2.a(), url)) {
            q.b(context, "context");
            if (a2.a(context, url)) {
                return true;
            }
        }
        tmi globalUrlInterceptor = getGlobalUrlInterceptor();
        q.b(context, "context");
        return globalUrlInterceptor.a(context, url);
    }

    private final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : str.hashCode() != 3556498 || !str.equals("test");
    }

    @Override // com.taobao.themis.inside.adapter.DefaultWebAdapter, com.taobao.themis.web.runtime.IWebAdapter
    public void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[]{this});
        } else if (!this.f22855a.compareAndSet(false, true)) {
        } else {
            android.taobao.windvane.jsbridge.api.c.a();
            android.taobao.windvane.jsbridge.q.a("WVApplication", (Class<? extends android.taobao.windvane.jsbridge.e>) WVApplication.class);
            android.taobao.windvane.jsbridge.q.a("WVLocation", (Class<? extends android.taobao.windvane.jsbridge.e>) WVLocationProxy.class, true);
            android.taobao.windvane.jsbridge.q.a("WVClient", (Class<? extends android.taobao.windvane.jsbridge.e>) WVClient.class, true);
            android.taobao.windvane.jsbridge.q.a("TBWVDialog", (Class<? extends android.taobao.windvane.jsbridge.e>) TBWVDialog.class, true);
            android.taobao.windvane.jsbridge.q.a("TBWVSecurity", (Class<? extends android.taobao.windvane.jsbridge.e>) TBWVSecurity.class, true);
            android.taobao.windvane.jsbridge.q.a("Scancode", (Class<? extends android.taobao.windvane.jsbridge.e>) ScancodeCallback.class, true);
            android.taobao.windvane.jsbridge.q.a("TBWeakNetStatus", (Class<? extends android.taobao.windvane.jsbridge.e>) TBWeakNetStatus.class, true);
            android.taobao.windvane.jsbridge.q.a("WebAppInterface", (Class<? extends android.taobao.windvane.jsbridge.e>) WebAppInterface.class, true);
            android.taobao.windvane.jsbridge.q.a("WVCameraPlus", (Class<? extends android.taobao.windvane.jsbridge.e>) WVCameraPlus.class, true);
            android.taobao.windvane.jsbridge.q.a("WVCamera", "takePhotoPlus", "WVCameraPlus", "takePhotoPlus");
            android.taobao.windvane.jsbridge.q.a("WVTBLocation", (Class<? extends android.taobao.windvane.jsbridge.e>) WVTBLocation.class, true);
            android.taobao.windvane.jsbridge.q.a("WVUICityList", (Class<? extends android.taobao.windvane.jsbridge.e>) WVUICityList.class, true);
            android.taobao.windvane.jsbridge.q.a("WVUIImagepreview", (Class<? extends android.taobao.windvane.jsbridge.e>) WVUIImagepreview.class, true);
            android.taobao.windvane.jsbridge.q.a("WVPerformance", (Class<? extends android.taobao.windvane.jsbridge.e>) WVH5PP.class);
        }
    }
}
