package com.taobao.themis.taobao.nav;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.utils.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/taobao/nav/TMSNavigatorAdapter;", "Lcom/taobao/themis/kernel/adapter/INavigatorAdapter;", "()V", "openURL", "", "context", "Landroid/content/Context;", "url", "", "extras", "Landroid/os/Bundle;", "opts", "config", "", "", "Companion", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSNavigatorAdapter implements INavigatorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(1725015515);
        kge.a(1386220645);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.adapter.INavigatorAdapter
    public boolean openURL(Context context, String url, Bundle bundle, Bundle bundle2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb4b883", new Object[]{this, context, url, bundle, bundle2, map})).booleanValue();
        }
        q.d(context, "context");
        q.d(url, "url");
        if (n.bF()) {
            Nav withExtras = Nav.from(context).withOptions(bundle2).withExtras(bundle);
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    switch (key.hashCode()) {
                        case -364238064:
                            if (key.equals("skipAllProcessor")) {
                                withExtras.skipAllProcessors();
                                break;
                            } else {
                                break;
                            }
                        case -9888733:
                            if (key.equals("className")) {
                                String packageName = context.getPackageName();
                                Object value = entry.getValue();
                                if (!(value instanceof String)) {
                                    value = null;
                                }
                                withExtras.withClassName(packageName, (String) value);
                                break;
                            } else {
                                break;
                            }
                        case 50511102:
                            if (key.equals("category")) {
                                Object value2 = entry.getValue();
                                if (!(value2 instanceof String)) {
                                    value2 = null;
                                }
                                withExtras.withCategory((String) value2);
                                break;
                            } else {
                                break;
                            }
                        case 611038506:
                            if (key.equals("allowEscape")) {
                                withExtras.allowEscape();
                                break;
                            } else {
                                break;
                            }
                        case 755823694:
                            if (key.equals("skipPreProcessor")) {
                                withExtras.skipPreprocess();
                                break;
                            } else {
                                break;
                            }
                        case 1069832742:
                            if (key.equals("disallowLoopback")) {
                                withExtras.disallowLoopback();
                                break;
                            } else {
                                break;
                            }
                        case 1428875869:
                            if (key.equals("disableTransition")) {
                                withExtras.disableTransition();
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            return withExtras.toUri(url);
        } else if (context instanceof Activity) {
            if (Nav.from(context).withOptions(bundle2).withExtras(bundle).forResult(38138).toUri(url)) {
                return true;
            }
            return Nav.from(context).withOptions(bundle2).withExtras(bundle).forResult(38138).allowEscape().toUri(url);
        } else if (!Nav.from(context).withOptions(bundle2).withExtras(bundle).toUri(url)) {
            return Nav.from(context).withOptions(bundle2).withExtras(bundle).allowEscape().toUri(url);
        } else {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/taobao/nav/TMSNavigatorAdapter$Companion;", "", "()V", "REQUEST_CODE_DEFAULT", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(435960675);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
