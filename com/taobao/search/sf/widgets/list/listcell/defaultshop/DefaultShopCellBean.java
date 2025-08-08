package com.taobao.search.sf.widgets.list.listcell.defaultshop;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.common.util.k;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public final class DefaultShopCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<JSONObject> auctions;
    private String cellSpm;
    private JSONArray detailTrace;
    private String innerAuctionIds;
    private String logo;
    private String originTItemType;
    private String sellerId;
    private String shopId;
    private String title;
    private JSONObject utLogMap;
    private Map<String, String> utParams;

    static {
        kge.a(-1473720373);
    }

    public DefaultShopCellBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Object ipc$super(DefaultShopCellBean defaultShopCellBean, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public final String getLogo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfcecf78", new Object[]{this}) : this.logo;
    }

    public final void setLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
        } else {
            this.logo = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DefaultShopCellBean(java.lang.String r10, java.lang.String r11, java.util.List r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, org.json.JSONObject r16, org.json.JSONArray r17, int r18, kotlin.jvm.internal.o r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r10
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r11
        L12:
            r4 = r0 & 4
            if (r4 == 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            goto L1f
        L1e:
            r4 = r12
        L1f:
            r5 = r0 & 8
            if (r5 == 0) goto L25
            r5 = r2
            goto L26
        L25:
            r5 = r13
        L26:
            r6 = r0 & 16
            if (r6 == 0) goto L2c
            r6 = r2
            goto L2d
        L2c:
            r6 = r14
        L2d:
            r7 = r0 & 32
            if (r7 == 0) goto L32
            goto L33
        L32:
            r2 = r15
        L33:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L3c
            r7 = r8
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            goto L3e
        L3c:
            r7 = r16
        L3e:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L46
            r0 = r8
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            goto L48
        L46:
            r0 = r17
        L48:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellBean.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONArray, int, kotlin.jvm.internal.o):void");
    }

    public final List<JSONObject> getAuctions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3de4ad1a", new Object[]{this}) : this.auctions;
    }

    public final void setAuctions(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54546f8a", new Object[]{this, list});
            return;
        }
        q.c(list, "<set-?>");
        this.auctions = list;
    }

    public final String getSellerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("822c6289", new Object[]{this}) : this.sellerId;
    }

    public final void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
        }
    }

    public final String getShopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this}) : this.shopId;
    }

    public final void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
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

    public final JSONArray getDetailTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("24890acb", new Object[]{this}) : this.detailTrace;
    }

    public final void setDetailTrace(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3298353", new Object[]{this, jSONArray});
        } else {
            this.detailTrace = jSONArray;
        }
    }

    public DefaultShopCellBean(String str, String str2, List<JSONObject> auctions, String str3, String str4, String str5, JSONObject jSONObject, JSONArray jSONArray) {
        q.c(auctions, "auctions");
        this.title = str;
        this.logo = str2;
        this.auctions = auctions;
        this.sellerId = str3;
        this.shopId = str4;
        this.originTItemType = str5;
        this.utLogMap = jSONObject;
        this.detailTrace = jSONArray;
        this.innerAuctionIds = "";
    }

    public final Map<String, String> getUTParams(c cVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d903bdda", new Object[]{this, cVar, new Integer(i)});
        }
        if (this.utParams == null) {
            this.utParams = com.taobao.search.mmd.util.c.a(this.utLogMap);
            if (cVar != null) {
                Map<String, String> map = this.utParams;
                if (map == null) {
                    q.a();
                }
                map.put("list_param", cVar.getKeyword() + '_' + this.abtest + '_' + this.rn);
                CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
                if (commonSearchResult != null) {
                    Map<String, String> map2 = this.utParams;
                    if (map2 == null) {
                        q.a();
                    }
                    String str = commonSearchResult.getMainInfo().rn;
                    q.a((Object) str, "totalResult.mainInfo.rn");
                    map2.put(k.a.PARAM_KEY_FIRST_RN, str);
                    com.alibaba.fastjson.JSONObject jSONObject = commonSearchResult.pageInfo;
                    if (jSONObject != null) {
                        Map<String, String> map3 = this.utParams;
                        if (map3 == null) {
                            q.a();
                        }
                        String string = jSONObject.getString("for_bts");
                        q.a((Object) string, "pageInfo.getString(\"for_bts\")");
                        map3.put("for_bts", string);
                    }
                }
            }
            Map<String, String> map4 = this.utParams;
            if (map4 == null) {
                q.a();
            }
            map4.put("list_type", "search");
            Map<String, String> map5 = this.utParams;
            if (map5 == null) {
                q.a();
            }
            String type = this.type;
            q.a((Object) type, "type");
            map5.put("tItemType", type);
            String str2 = this.originTItemType;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (!z) {
                Map<String, String> map6 = this.utParams;
                if (map6 == null) {
                    q.a();
                }
                String str3 = this.originTItemType;
                if (str3 == null) {
                    q.a();
                }
                map6.put("originTItemType", str3);
            }
            Map<String, String> map7 = this.utParams;
            if (map7 == null) {
                q.a();
            }
            map7.put("index", String.valueOf(i));
            Map<String, String> map8 = this.utParams;
            if (map8 == null) {
                q.a();
            }
            map8.put("srp_seq", String.valueOf(this.pageNo));
            Map<String, String> map9 = this.utParams;
            if (map9 == null) {
                q.a();
            }
            map9.put("srp_pos", String.valueOf(i));
            Map<String, String> map10 = this.utParams;
            if (map10 == null) {
                q.a();
            }
            map10.put("s_isEl", "1");
            String innerAuctionIds = getInnerAuctionIds();
            if (!StringUtils.isEmpty(innerAuctionIds)) {
                Map<String, String> map11 = this.utParams;
                if (map11 == null) {
                    q.a();
                }
                map11.put("x_item_ids", innerAuctionIds);
            }
        }
        return this.utParams;
    }

    public final String getCellSpm(c cVar, int i) {
        CommonSearchResult commonSearchResult;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4597c31e", new Object[]{this, cVar, new Integer(i)});
        }
        String str = this.cellSpm;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            Map<String, String> map = (cVar == null || (commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult()) == null || (mainInfo = commonSearchResult.getMainInfo()) == null) ? null : mainInfo.pageTraceArgs;
            if (map != null) {
                String str2 = map.get("spm-cnt");
                if (!StringUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder();
                    if (str2 == null) {
                        q.a();
                    }
                    sb.append(n.a(str2, ".0.0", "", false, 4, (Object) null));
                    sb.append(".shoplist.");
                    sb.append(i);
                    this.cellSpm = sb.toString();
                }
            }
        }
        String str3 = this.cellSpm;
        return str3 == null ? "" : str3;
    }

    private final String getInnerAuctionIds() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e37e13e4", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.innerAuctionIds)) {
            if (this.auctions.size() > 0) {
                StringBuilder sb = new StringBuilder();
                int size = this.auctions.size();
                for (int i = 0; i < size; i++) {
                    String optString = this.auctions.get(i).optString("nid");
                    q.a((Object) optString, "auction.optString(\"nid\")");
                    if (!StringUtils.isEmpty(optString)) {
                        sb.append(optString);
                        sb.append(",");
                    }
                }
                str = sb.deleteCharAt(sb.length() - 1).toString();
                q.a((Object) str, "contentIds.deleteCharAt(…ds.length - 1).toString()");
            } else {
                str = "";
            }
            this.innerAuctionIds = str;
        }
        return this.innerAuctionIds;
    }
}
