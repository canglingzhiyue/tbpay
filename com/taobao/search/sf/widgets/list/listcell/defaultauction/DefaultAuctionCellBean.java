package com.taobao.search.sf.widgets.list.listcell.defaultauction;

import android.support.v4.app.FrameMetricsAggregator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.mmd.util.c;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public final class DefaultAuctionCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String auctionUrl;
    private String img;
    private String originTItemType;
    private String price;
    private String priceUnit;
    private String title;
    private String uprightImg;
    private String uprightImgAspectRatio;
    private JSONObject utLogMap;
    private Map<String, String> utParams;

    static {
        kge.a(1687427739);
    }

    public DefaultAuctionCellBean() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final String getImg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fae7b08c", new Object[]{this}) : this.img;
    }

    public final void setImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509b43d2", new Object[]{this, str});
        } else {
            this.img = str;
        }
    }

    public final String getUprightImg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c5b0a61", new Object[]{this}) : this.uprightImg;
    }

    public final void setUprightImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5efc935", new Object[]{this, str});
        } else {
            this.uprightImg = str;
        }
    }

    public final String getUprightImgAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e5cdfe", new Object[]{this}) : this.uprightImgAspectRatio;
    }

    public final void setUprightImgAspectRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2f1fa0", new Object[]{this, str});
        } else {
            this.uprightImgAspectRatio = str;
        }
    }

    public final String getPriceUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("639dd3a2", new Object[]{this}) : this.priceUnit;
    }

    public final void setPriceUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925a5c7c", new Object[]{this, str});
        } else {
            this.priceUnit = str;
        }
    }

    public final String getPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3a46146", new Object[]{this}) : this.price;
    }

    public final void setPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
        } else {
            this.price = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DefaultAuctionCellBean(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, org.json.JSONObject r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.o r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r11
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r12
        L12:
            r4 = r0 & 4
            if (r4 == 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r13
        L19:
            r5 = r0 & 8
            if (r5 == 0) goto L1f
            r5 = r2
            goto L20
        L1f:
            r5 = r14
        L20:
            r6 = r0 & 16
            if (r6 == 0) goto L26
            r6 = r2
            goto L27
        L26:
            r6 = r15
        L27:
            r7 = r0 & 32
            if (r7 == 0) goto L2d
            r7 = r2
            goto L2f
        L2d:
            r7 = r16
        L2f:
            r8 = r0 & 64
            if (r8 == 0) goto L37
            r8 = 0
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            goto L39
        L37:
            r8 = r17
        L39:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L3f
            r9 = r2
            goto L41
        L3f:
            r9 = r18
        L41:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L46
            goto L48
        L46:
            r2 = r19
        L48:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, java.lang.String, java.lang.String, int, kotlin.jvm.internal.o):void");
    }

    public final JSONObject getUtLogMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4fa14d62", new Object[]{this}) : this.utLogMap;
    }

    public final void setUtLogMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c4883e", new Object[]{this, jSONObject});
        } else {
            this.utLogMap = jSONObject;
        }
    }

    public final String getOriginTItemType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6b5b154", new Object[]{this}) : this.originTItemType;
    }

    public final void setOriginTItemType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea284e0a", new Object[]{this, str});
        } else {
            this.originTItemType = str;
        }
    }

    public final String getAuctionUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4f09c17", new Object[]{this}) : this.auctionUrl;
    }

    public final void setAuctionUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200c6e3f", new Object[]{this, str});
        } else {
            this.auctionUrl = str;
        }
    }

    public DefaultAuctionCellBean(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7, String str8) {
        this.title = str;
        this.img = str2;
        this.uprightImg = str3;
        this.uprightImgAspectRatio = str4;
        this.priceUnit = str5;
        this.price = str6;
        this.utLogMap = jSONObject;
        this.originTItemType = str7;
        this.auctionUrl = str8;
    }

    public final Map<String, String> getUTParams(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fed1de56", new Object[]{this, new Integer(i)});
        }
        if (this.utParams == null) {
            this.utParams = c.a(this.utLogMap);
            Map<String, String> map = this.utParams;
            if (map == null) {
                q.a();
            }
            String type = this.type;
            q.a((Object) type, "type");
            map.put("tItemType", type);
            String str = this.originTItemType;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z) {
                Map<String, String> map2 = this.utParams;
                if (map2 == null) {
                    q.a();
                }
                String str2 = this.originTItemType;
                if (str2 == null) {
                    q.a();
                }
                map2.put("originTItemType", str2);
            }
            Map<String, String> map3 = this.utParams;
            if (map3 == null) {
                q.a();
            }
            map3.put("index", String.valueOf(i));
            Map<String, String> map4 = this.utParams;
            if (map4 == null) {
                q.a();
            }
            map4.put("srp_seq", String.valueOf(this.pageNo));
            Map<String, String> map5 = this.utParams;
            if (map5 == null) {
                q.a();
            }
            map5.put("srp_pos", String.valueOf(i));
            Map<String, String> map6 = this.utParams;
            if (map6 == null) {
                q.a();
            }
            map6.put("s_isEl", "1");
        }
        return this.utParams;
    }
}
