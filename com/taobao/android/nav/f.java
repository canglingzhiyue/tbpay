package com.taobao.android.nav;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import tb.ado;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class f implements b, e, k<f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<a> componentFilterItems;
    private boolean mInit = false;
    private final e mNavProcessor;
    private f mNextNode;
    private boolean mSkip;
    private List<p> uriFilterItems;

    static {
        kge.a(1567020080);
        kge.a(-1044427497);
        kge.a(-719787762);
        kge.a(1116474209);
    }

    public boolean addSchemaWhenDeficiency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd2dd70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public b asFilter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("96a7d131", new Object[]{this}) : this;
    }

    public e asNavProcessor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9b567737", new Object[]{this}) : this;
    }

    public k asNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("a1dd777e", new Object[]{this}) : this;
    }

    public void addUriFilterItem(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3702b41b", new Object[]{this, pVar});
            return;
        }
        if (this.uriFilterItems == null) {
            this.uriFilterItems = new ArrayList();
        }
        this.uriFilterItems.add(pVar);
    }

    public void addComponentFilterItem(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51661db", new Object[]{this, aVar});
            return;
        }
        if (this.componentFilterItems == null) {
            this.componentFilterItems = new ArrayList();
        }
        this.componentFilterItems.add(aVar);
    }

    public f(e eVar) {
        this.mNavProcessor = eVar;
    }

    public final void addNext(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1fe9103", new Object[]{this, fVar});
        } else {
            this.mNextNode = fVar;
        }
    }

    /* renamed from: getNext */
    public final f m1006getNext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9a3b1cee", new Object[]{this}) : this.mNextNode;
    }

    public final boolean execute(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1905aa47", new Object[]{this, intent, dVar})).booleanValue() : process(intent, dVar);
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        if (!this.mInit) {
            this.mInit = true;
            this.mSkip = this.mNavProcessor.skip();
        }
        return this.mSkip;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue() : this.mNavProcessor.process(intent, dVar);
    }

    public boolean filter(Intent intent, d dVar) {
        ComponentName component;
        List<p> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350b7e0a", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri uriCompat = getUriCompat(intent.getData());
        if (uriCompat != null && (list = this.uriFilterItems) != null && !list.isEmpty()) {
            String scheme = uriCompat.getScheme();
            String host = uriCompat.getHost();
            String path = uriCompat.getPath();
            for (p pVar : this.uriFilterItems) {
                if (scheme == null || pVar.schemeFilter(scheme)) {
                    if (host == null || pVar.hostFilter(host)) {
                        if (path == null || pVar.pathFilter(path)) {
                            if (pVar.queryFilter(uriCompat)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (this.componentFilterItems != null && (component = intent.getComponent()) != null && !this.componentFilterItems.isEmpty()) {
            String packageName = component.getPackageName();
            String className = component.getClassName();
            for (a aVar : this.componentFilterItems) {
                if (aVar.a(packageName) && aVar.b(className)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : this.mNavProcessor.name();
    }

    public Uri getUriCompat(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("38e7ba7f", new Object[]{this, uri});
        }
        if (!addSchemaWhenDeficiency()) {
            return uri;
        }
        String scheme = uri.getScheme();
        String str = null;
        if (scheme == null) {
            String uri2 = uri.toString();
            if (uri2.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + uri2;
            } else {
                str = com.taobao.search.common.util.k.HTTP_PREFIX + uri2;
            }
        } else if (scheme.startsWith(ado.URL_SEPARATOR)) {
            str = "http:" + uri;
        }
        if (TextUtils.isEmpty(str)) {
            return uri;
        }
        TLog.loge("Nav", "The Url used to determine has a scheme added, urlString: " + str);
        return Uri.parse(str);
    }
}
