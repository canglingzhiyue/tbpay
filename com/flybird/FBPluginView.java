package com.flybird;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.alipay.android.app.template.FBPlugin;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.PluginViewDelegate;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class FBPluginView extends FBView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FBPlugin A;
    public final FBPluginFactory B;
    public HashMap<String, String> C;
    public HashMap<String, String> D;
    public HashMap<String, String> E;
    public HashMap<String, String> F;
    public Rect G;

    public FBPluginView(Context context, FBDocument fBDocument, FBPluginFactory fBPluginFactory, Map<String, String> map) {
        super(context, new FBEmbedView(context), fBDocument);
        this.C = new HashMap<>();
        this.D = new HashMap<>();
        this.E = new HashMap<>();
        this.F = new HashMap<>();
        this.B = fBPluginFactory;
        if (fBPluginFactory != null) {
            if (map == null) {
                return;
            }
            this.C.putAll(map);
            return;
        }
        throw new IllegalArgumentException("plugin factory shouldn't be null!");
    }

    public static /* synthetic */ Object ipc$super(FBPluginView fBPluginView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1807346616:
                super.updateFunc((String) objArr[0], (String) objArr[1]);
                return null;
            case -1305055009:
                super.onLoadFinish();
                return null;
            case -1022301035:
                super.updateCSS((String) objArr[0], (String) objArr[1]);
                return null;
            case -740778899:
                super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue());
                return null;
            case 190242413:
                return super.invoke((String) objArr[0], (String) objArr[1]);
            case 663633004:
                super.updateEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1908751287:
                return super.getEncryptValue();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.flybird.FBView
    public String getEncryptValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71c53bb7", new Object[]{this});
        }
        String encryptValue = this.A.getEncryptValue();
        return encryptValue != null ? encryptValue : super.getEncryptValue();
    }

    @Override // com.flybird.FBView
    public String invoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56de6d", new Object[]{this, str, str2});
        }
        FBPlugin fBPlugin = this.A;
        if (fBPlugin != null && (fBPlugin instanceof PluginViewDelegate)) {
            return ((PluginViewDelegate) fBPlugin).handleInvoke(str, str2);
        }
        return super.invoke(str, str2);
    }

    @Override // com.flybird.FBView
    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (!isDestroyed()) {
            if (this.A == null) {
                this.A = this.B.createPluginInstance(this.mDoc.k, this.mDoc.h0, this.C);
            }
            FBPlugin fBPlugin = this.A;
            if (fBPlugin == null) {
                FBLogger.e(FBView.TAG, "createPluginInstance return null!!");
                return;
            }
            fBPlugin.setNode(getNode());
            View innerView = getInnerView();
            if (innerView != null && (innerView instanceof FBEmbedView)) {
                FBEmbedView fBEmbedView = (FBEmbedView) innerView;
                fBEmbedView.setPlugin(this.A);
                setInnerView(fBEmbedView.apply());
                for (Map.Entry<String, String> entry : this.C.entrySet()) {
                    updateAttr(entry.getKey(), entry.getValue());
                }
                this.C.clear();
                Rect rect = this.G;
                if (rect != null) {
                    setRect(rect.left, rect.top, rect.width(), this.G.height());
                    this.G = null;
                }
                for (Map.Entry<String, String> entry2 : this.D.entrySet()) {
                    updateCSS(entry2.getKey(), entry2.getValue());
                }
                this.D.clear();
                for (Map.Entry<String, String> entry3 : this.E.entrySet()) {
                    String key = entry3.getKey();
                    String value = entry3.getValue();
                    this.E.put(key, value);
                    FBPlugin fBPlugin2 = this.A;
                    if (fBPlugin2 == null || !fBPlugin2.updateFunc(key, value)) {
                        super.updateFunc(key, value);
                    }
                }
                this.E.clear();
                for (Map.Entry<String, String> entry4 : this.F.entrySet()) {
                    String key2 = entry4.getKey();
                    String value2 = entry4.getValue();
                    this.F.put(key2, value2);
                    FBPlugin fBPlugin3 = this.A;
                    if (fBPlugin3 == null || !fBPlugin3.updateEvent(key2, value2)) {
                        super.updateEvent(key2, value2);
                    }
                }
                this.F.clear();
            }
            this.A.onLoadFinish();
            super.onLoadFinish();
        }
    }

    @Override // com.flybird.FBView
    public void setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d89c6d", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.G = new Rect((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        FBPlugin fBPlugin = this.A;
        if (fBPlugin != null && fBPlugin.setRect(f, f2, f3, f4)) {
            return;
        }
        super.setRect(f, f2, f3, f4);
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
            return;
        }
        this.C.put(str, str2);
        FBPlugin fBPlugin = this.A;
        if (fBPlugin != null && fBPlugin.updateAttr(str, str2)) {
            return;
        }
        super.updateAttr(str, str2);
    }

    @Override // com.flybird.FBView
    public void updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
            return;
        }
        this.D.put(str, str2);
        FBPlugin fBPlugin = this.A;
        if (fBPlugin != null && fBPlugin.updateCSS(str, str2)) {
            return;
        }
        if (getInnerView() != null && (getInnerView() instanceof FBEmbedView) && (str.equals("visibility") || str.equals("visibility-display"))) {
            return;
        }
        super.updateCSS(str, str2);
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        this.F.put(str, str2);
        FBPlugin fBPlugin = this.A;
        if (fBPlugin != null && fBPlugin.updateEvent(str, str2)) {
            return;
        }
        super.updateEvent(str, str2);
    }

    @Override // com.flybird.FBView
    public void updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461448", new Object[]{this, str, str2});
            return;
        }
        this.E.put(str, str2);
        FBPlugin fBPlugin = this.A;
        if (fBPlugin != null && fBPlugin.updateFunc(str, str2)) {
            return;
        }
        super.updateFunc(str, str2);
    }
}
