package com.taobao.android.detail.wrapper.ext.floatview;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.eoz;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class FloatViewWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ID = "detail_floatweex_instance";
    public static final String CHANNEL_ID_PREFIX = "detail_floatweex_instance";
    private static final String TAG = "floatView.FloatViewWeexModule";
    private a channel;
    private b instanceChannel;

    static {
        kge.a(1141741131);
    }

    public static /* synthetic */ Object ipc$super(FloatViewWeexModule floatViewWeexModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FloatViewWeexModule() {
        emu.a("com.taobao.android.detail.wrapper.ext.floatview.FloatViewWeexModule");
    }

    @JSMethod
    public void onMessage(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce0e879", new Object[]{this, jSCallback});
        } else if ("true".equalsIgnoreCase(Uri.parse(this.mWXSDKInstance.ak()).getQueryParameter("enableMulitMessageChannel"))) {
            if (this.instanceChannel == null) {
                initChannelInstance();
            }
            b bVar = this.instanceChannel;
            if (bVar != null) {
                bVar.a(jSCallback);
            } else {
                i.a(TAG, "onMessage JSCallback but channel is null");
            }
        } else {
            if (this.channel == null) {
                initChannel();
            }
            a aVar = this.channel;
            if (aVar != null) {
                aVar.a(jSCallback);
            } else {
                i.a(TAG, "onMessage JSCallback but channel is null");
            }
        }
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763590d1", new Object[]{this, map});
            return;
        }
        i.c(TAG, "dispatchMessage:" + map);
        if ("true".equalsIgnoreCase(Uri.parse(this.mWXSDKInstance.ak()).getQueryParameter("enableMulitMessageChannel"))) {
            if (this.instanceChannel == null) {
                initChannelInstance();
            }
            if (map == null || map.size() == 0 || this.instanceChannel == null) {
                return;
            }
            Object obj = map.get("target");
            if (!(obj instanceof String)) {
                return;
            }
            this.instanceChannel.postMessage((String) obj, map);
            return;
        }
        if (this.channel == null) {
            initChannel();
        }
        if (map == null || map.size() == 0 || this.channel == null) {
            return;
        }
        Object obj2 = map.get("target");
        if (!(obj2 instanceof String)) {
            return;
        }
        this.channel.postMessage((String) obj2, map);
    }

    @JSMethod
    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        i.c(TAG, "js:" + str);
    }

    private void initChannel() {
        Activity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3640da", new Object[]{this});
        } else if (this.mWXSDKInstance == null || (c = fpz.c(this.mWXSDKInstance.O())) == null) {
        } else {
            this.channel = new a(n.a(c));
        }
    }

    private void initChannelInstance() {
        Activity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd95d40f", new Object[]{this});
        } else if (this.mWXSDKInstance == null || (c = fpz.c(this.mWXSDKInstance.O())) == null) {
        } else {
            this.instanceChannel = new b(n.a(c));
        }
    }

    /* loaded from: classes5.dex */
    public class a extends eoz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final g b;
        private final List<JSCallback> c;

        static {
            kge.a(284908162);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1467730997) {
                super.onMessage(objArr[0]);
                return null;
            } else if (hashCode != 1847263348) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.postMessage((String) objArr[0], objArr[1]);
                return null;
            }
        }

        @Override // tb.eoz
        public String getkey() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96f6ff50", new Object[]{this}) : "detail_floatweex_instance";
        }

        private a(g gVar) {
            this.c = new ArrayList();
            this.b = gVar;
            if (gVar != null) {
                gVar.a(new l() { // from class: com.taobao.android.detail.wrapper.ext.floatview.FloatViewWeexModule.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.open.l
                    public void notifyDataSetChanged() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.android.detail.core.open.l
                    public eoz getMessageChannel(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (eoz) ipChange.ipc$dispatch("ed3ce113", new Object[]{this, str});
                        }
                        if (!StringUtils.equals(str, "detail_floatweex_instance")) {
                            return null;
                        }
                        return a.this;
                    }
                });
            } else {
                i.a(FloatViewWeexModule.TAG, "WeexModuleMessageChannel() but detailSdk is null");
            }
        }

        public void a(JSCallback jSCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de4bab20", new Object[]{this, jSCallback});
            } else {
                this.c.add(jSCallback);
            }
        }

        @Override // tb.eoz
        public void onMessage(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            super.onMessage(obj);
            for (JSCallback jSCallback : this.c) {
                jSCallback.invokeAndKeepAlive(obj);
            }
        }

        @Override // tb.eoz
        public void postMessage(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1b0074", new Object[]{this, str, obj});
                return;
            }
            super.postMessage(str, obj);
            g gVar = this.b;
            if (gVar == null) {
                return;
            }
            gVar.a(str, obj);
        }
    }

    /* loaded from: classes5.dex */
    public class b extends eoz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final g b;
        private final List<JSCallback> c;

        static {
            kge.a(-182186707);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1467730997) {
                super.onMessage(objArr[0]);
                return null;
            } else if (hashCode != 1847263348) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.postMessage((String) objArr[0], objArr[1]);
                return null;
            }
        }

        private b(g gVar) {
            this.c = new ArrayList();
            this.b = gVar;
            if (gVar != null) {
                gVar.a(new l() { // from class: com.taobao.android.detail.wrapper.ext.floatview.FloatViewWeexModule.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.open.l
                    public void notifyDataSetChanged() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.android.detail.core.open.l
                    public eoz getMessageChannel(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (eoz) ipChange.ipc$dispatch("ed3ce113", new Object[]{this, str});
                        }
                        if (!StringUtils.equals(str, b.this.getkey())) {
                            return null;
                        }
                        return b.this;
                    }
                });
            } else {
                i.a(FloatViewWeexModule.TAG, "WeexModuleMessageChannel() but detailSdk is null");
            }
        }

        @Override // tb.eoz
        public String getkey() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96f6ff50", new Object[]{this}) : com.taobao.android.detail.wrapper.ext.floatview.a.a("detail_floatweex_instance", FloatViewWeexModule.this.mWXSDKInstance.ak());
        }

        public void a(JSCallback jSCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de4bab20", new Object[]{this, jSCallback});
            } else {
                this.c.add(jSCallback);
            }
        }

        @Override // tb.eoz
        public void onMessage(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            super.onMessage(obj);
            for (JSCallback jSCallback : this.c) {
                jSCallback.invokeAndKeepAlive(obj);
            }
        }

        @Override // tb.eoz
        public void postMessage(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1b0074", new Object[]{this, str, obj});
                return;
            }
            super.postMessage(str, obj);
            g gVar = this.b;
            if (gVar == null) {
                return;
            }
            gVar.a(com.taobao.android.detail.wrapper.ext.floatview.a.a(str, FloatViewWeexModule.this.mWXSDKInstance.ak()), obj);
        }
    }
}
