package com.taobao.search.searchdoor.shop.widget.bar;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.taobao.TBActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import tb.iuh;
import tb.iuj;
import tb.ium;
import tb.iun;
import tb.iur;
import tb.kge;
import tb.nrj;
import tb.nsa;
import tb.nsi;

/* loaded from: classes8.dex */
public class d extends iun<LinearLayout, c, ShopSearchBarPresenter, nsi, Void> implements nsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2088977498);
        kge.a(-333802297);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.iuh, com.taobao.search.searchdoor.shop.widget.bar.ShopSearchBarPresenter] */
    @Override // tb.iun
    public /* synthetic */ ShopSearchBarPresenter d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.iuj, com.taobao.search.searchdoor.shop.widget.bar.c] */
    @Override // tb.iun
    public /* synthetic */ c f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : b();
    }

    public d(Activity activity, ium iumVar, nsi nsiVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, nsiVar, viewGroup, iurVar);
        K().setTextChangeListener(this);
        attachToContainer();
    }

    public ShopSearchBarPresenter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopSearchBarPresenter) ipChange.ipc$dispatch("38a71053", new Object[]{this}) : new ShopSearchBarPresenter();
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a1d214ac", new Object[]{this}) : new c();
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        J().e();
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : getClass().getSimpleName();
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            K().handleIntent(intent, J(), false);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            J().df_();
        }
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (FestivalMgr.a().a("global")) {
            g();
        } else {
            h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        FestivalMgr.a().a(this.mActivity, (View) getView(), TBActionBar.ActionBarStyle.NORMAL);
        J().d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        FestivalMgr.a().a(this.mActivity, (View) getView(), TBActionBar.ActionBarStyle.NORMAL);
        J().f();
    }

    @Override // tb.nsa
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            postEvent(nrj.b.a(str));
        }
    }
}
