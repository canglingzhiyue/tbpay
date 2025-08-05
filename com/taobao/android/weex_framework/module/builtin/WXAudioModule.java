package com.taobao.android.weex_framework.module.builtin;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.b;
import com.taobao.android.weex.i;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.h;
import com.taobao.android.weex_framework.l;
import com.uc.webview.export.media.CommandID;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXAudioModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "audio";
    private final h weexAudioResolver = l.a().r();

    public static /* synthetic */ Object ipc$super(WXAudioModule wXAudioModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -498459201) {
            super.onMainThreadDestroy();
            return null;
        } else if (hashCode != 1738137715) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onInit((String) objArr[0], (i) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ WeexValue access$000(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("bb10ead0", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ b access$100(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b829d41d", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1000(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("392e8ac1", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1100(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("a9136460", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1200(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("18f83dff", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1300(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("88dd179e", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1400(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("f8c1f13d", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1500(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("68a6cadc", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1600(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("d88ba47b", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1700(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("48707e1a", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1800(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("b85557b9", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ b access$200(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7f5bcbc", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$300(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("abf77ad", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$400(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("7aa4514c", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$500(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("ea892aeb", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$600(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("5a6e048a", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$700(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("ca52de29", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$800(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("3a37b7c8", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$900(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("aa1c9167", new Object[]{wXAudioModule, weexValueArr, new Integer(i)}) : wXAudioModule.getArg(weexValueArr, i);
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
        } else {
            super.onInit(str, iVar);
        }
    }

    public void create(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984a1b10", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.a(getWeexInstance(), i, jSONObject);
    }

    public void play(int i, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae82e268", new Object[]{this, new Integer(i), bVar, bVar2});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.a(getWeexInstance(), i, bVar, bVar2);
    }

    public void pause(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5aa326", new Object[]{this, new Integer(i)});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.a(getWeexInstance(), i);
    }

    public void destroy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i)});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.b(getWeexInstance(), i);
    }

    public void setSrc(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a03adc4", new Object[]{this, new Integer(i), str});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.a(getWeexInstance(), i, str);
    }

    public void setCurrentTime(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fb8e4b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.a(getWeexInstance(), i, i2);
    }

    public int getCurrentTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb13c69f", new Object[]{this, new Integer(i)})).intValue();
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return 0;
        }
        return hVar.c(getWeexInstance(), i);
    }

    public long getDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2ec4a86", new Object[]{this, new Integer(i)})).longValue();
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return 0L;
        }
        return hVar.d(getWeexInstance(), i);
    }

    public void setMuted(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c9ce61", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.a(getWeexInstance(), i, z);
    }

    public boolean isMuted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e614b59f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return false;
        }
        return hVar.e(getWeexInstance(), i);
    }

    public boolean isPaused(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("595a0f68", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return false;
        }
        return hVar.f(getWeexInstance(), i);
    }

    public boolean isEnded(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7d755b0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return false;
        }
        return hVar.g(getWeexInstance(), i);
    }

    public void setLoop(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53e609e", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.c(getWeexInstance(), i, z);
    }

    public void setAutoPlay(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaed533d", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.b(getWeexInstance(), i, z);
    }

    public void addEventListener(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143c5d39", new Object[]{this, new Integer(i), str});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.b(getWeexInstance(), i, str);
    }

    public void removeEventListener(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc2e79c", new Object[]{this, new Integer(i), str});
            return;
        }
        h hVar = this.weexAudioResolver;
        if (hVar == null) {
            return;
        }
        hVar.c(getWeexInstance(), i, str);
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        this.weexAudioResolver.a(getWeexInstance().getInstanceId());
    }

    static {
        kge.a(-1485470802);
        METHODS = new String[]{"create", "play", "pause", "destroy", "setSrc", "setCurrentTime", "getCurrentTime", "getDuration", CommandID.setMuted, "isMuted", "isPaused", "isEnded", "setLoop", "setAutoPlay", "addEventListener", "removeEventListener"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (r11.equals("setSrc") != false) goto L11;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r9, java.lang.String r10, java.lang.String r11, final com.taobao.android.weex.WeexValue[] r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXAudioModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
