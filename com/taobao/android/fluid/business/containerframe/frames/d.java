package com.taobao.android.fluid.business.containerframe.frames;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;
import tb.kge;
import tb.oec;
import tb.ptk;
import tb.qqd;
import tb.sni;
import tb.spj;
import tb.spy;

/* loaded from: classes5.dex */
public class d extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LruCache<String, ptk> f;
    private String g;

    static {
        kge.a(1614286871);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1386292667) {
            super.a((a.c) objArr[0]);
            return null;
        } else if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public d(FluidContext fluidContext) {
        super(fluidContext);
        this.f = new LruCache<String, ptk>(3) { // from class: com.taobao.android.fluid.business.containerframe.frames.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int a(String str, ptk ptkVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3a32744e", new Object[]{this, str, ptkVar})).intValue();
                }
                return 1;
            }

            @Override // android.util.LruCache
            public /* synthetic */ void entryRemoved(boolean z, String str, ptk ptkVar, ptk ptkVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), str, ptkVar, ptkVar2});
                } else {
                    a(z, str, ptkVar, ptkVar2);
                }
            }

            @Override // android.util.LruCache
            public /* synthetic */ int sizeOf(String str, ptk ptkVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, ptkVar})).intValue() : a(str, ptkVar);
            }

            public void a(boolean z, String str, ptk ptkVar, ptk ptkVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b0b0988", new Object[]{this, new Boolean(z), str, ptkVar, ptkVar2});
                    return;
                }
                IMessageService iMessageService = (IMessageService) d.this.f12380a.getService(IMessageService.class);
                if (iMessageService == null) {
                    return;
                }
                iMessageService.unRegisterMessageHandler(ptkVar);
            }
        };
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.b
    public void a() {
        sni lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (!spj.e(this.f12380a) || (lockListListener = ((ISceneConfigService) this.f12380a.getService(ISceneConfigService.class)).getLockListListener()) == null) {
            return;
        }
        lockListListener.b(false);
    }

    public void a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a16adc", new Object[]{this, viewStub});
            return;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.fluid_sdk_ly_common_weex);
            this.c = viewStub.inflate();
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.business.containerframe.frames.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    d.this.g();
                }
            }
        });
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.b
    public void b() {
        sni lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (!spj.e(this.f12380a) || (lockListListener = ((ISceneConfigService) this.f12380a.getService(ISceneConfigService.class)).getLockListListener()) == null) {
            return;
        }
        lockListListener.b(true);
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.c
    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5eda45", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            if (this.e != null && this.e.g().equals(cVar.g())) {
                return;
            }
            String k = k();
            final ptk ptkVar = this.f.get(k);
            final IMessageService iMessageService = (IMessageService) this.f12380a.getService(IMessageService.class);
            if (ptkVar == null) {
                if (!StringUtils.isEmpty(this.g)) {
                    ptkVar = new qqd(this.f12380a, (ViewGroup) this.c, this.g);
                }
                this.f.put(k, ptkVar);
                oec.a(new Runnable() { // from class: com.taobao.android.fluid.business.containerframe.frames.d.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            iMessageService.registerMessageHandler(ptkVar);
                        }
                    }
                });
            }
            ptkVar.a(cVar.c);
            iMessageService.sendMessage(new spy("VSMSG_updateGoodsListData", cVar.c, cVar.a(this.f12380a)));
            super.a(cVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    private String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : StringUtils.isEmpty(this.g) ? "WeexUrl" : this.g;
    }
}
