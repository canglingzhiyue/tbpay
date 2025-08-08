package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.xsearchplugin.jarvis.utils.c;
import com.taobao.search.common.util.r;
import com.taobao.search.jarvis.bean.b;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.util.d;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nnv INSTANCE;

    static {
        kge.a(-321176154);
        INSTANCE = new nnv();
    }

    private nnv() {
    }

    public final b a(jxs jarvis) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ff5e81ab", new Object[]{this, jarvis});
        }
        q.c(jarvis, "jarvis");
        Map<String, Object> i = jarvis.i();
        if (i != null) {
            Object obj = i.get(aw.PARAM_SEARCH_KEYWORD_POS);
            if (!(obj instanceof String)) {
                obj = null;
            }
            f = d.b((String) obj, -1);
        } else {
            f = jarvis.f();
        }
        if (f >= 0) {
            return a(jarvis, f);
        }
        return b.Companion.a();
    }

    private final b a(jxs jxsVar, int i) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        int i2;
        ResultMainInfoBean mainInfo;
        int i3;
        int i4 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("82606368", new Object[]{this, jxsVar, new Integer(i4)});
        }
        iru b = jxsVar.b();
        q.a((Object) b, "jarvis.widgetModelAdapter");
        a d = b.d();
        q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult == null) {
            return b.Companion.a();
        }
        if (i4 >= baseSearchResult.getCellsCount() || i4 < 0) {
            return b.Companion.a();
        }
        int i5 = baseSearchResult.getCell(i4).pageNo;
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb7 = new StringBuilder();
        StringBuilder sb8 = new StringBuilder();
        StringBuilder sb9 = new StringBuilder();
        StringBuilder sb10 = new StringBuilder();
        StringBuilder sb11 = new StringBuilder();
        int i6 = i4;
        for (int i7 = i4 - 1; i7 >= 0 && baseSearchResult.getCell(i7).pageNo == i5; i7--) {
            i6 = i7;
        }
        int cellsCount = baseSearchResult.getCellsCount();
        int i8 = i4;
        while (i4 < cellsCount) {
            BaseCellBean cell = baseSearchResult.getCell(i4);
            int i9 = cellsCount;
            if (!(!q.a((Object) cell.cardType, (Object) "item"))) {
                if (cell.pageNo != i5) {
                    break;
                }
                i8 = i4;
            }
            i4++;
            cellsCount = i9;
        }
        if (i6 <= i8) {
            int i10 = i6;
            while (true) {
                BaseCellBean item = baseSearchResult.getCell(i10);
                if (!q.a((Object) item.cardType, (Object) "item")) {
                    i3 = i8;
                    sb = sb11;
                    sb2 = sb10;
                    sb3 = sb9;
                } else if (!item.isExposed) {
                    break;
                } else {
                    q.a((Object) item, "item");
                    i3 = i8;
                    sb = sb11;
                    sb2 = sb10;
                    sb3 = sb9;
                    a(item, sb6, sb7, sb8, sb9);
                }
                if (i10 == i3) {
                    break;
                }
                i10++;
                sb9 = sb3;
                i8 = i3;
                sb11 = sb;
                sb10 = sb2;
            }
        }
        sb = sb11;
        sb2 = sb10;
        sb3 = sb9;
        int cellsCount2 = baseSearchResult.getCellsCount();
        for (int g = jxsVar.g() + 1; g < cellsCount2; g++) {
            BaseCellBean item2 = baseSearchResult.getCell(g);
            q.a((Object) item2, "item");
            a(item2, sb6, sb7, sb8, sb3);
        }
        if (!r.X()) {
            iru b2 = jxsVar.b();
            q.a((Object) b2, "jarvis.widgetModelAdapter");
            a d2 = b2.d();
            q.a((Object) d2, "jarvis.widgetModelAdapter.scopeDatasource");
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d2.getLastSearchResult();
            int i11 = (baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null) ? i5 : mainInfo.page;
            if (i11 == i5) {
                sb5 = sb2;
                sb5.append((CharSequence) sb6);
                sb4 = sb;
                sb4.append((CharSequence) sb7);
            } else {
                sb4 = sb;
                sb5 = sb2;
                int cellsCount3 = baseSearchResult.getCellsCount();
                int cellsCount4 = baseSearchResult.getCellsCount() - 1;
                while (true) {
                    int i12 = cellsCount4;
                    i2 = cellsCount3;
                    cellsCount3 = i12;
                    if (cellsCount3 < 0 || baseSearchResult.getCell(cellsCount3).pageNo != i11) {
                        break;
                    }
                    cellsCount4 = cellsCount3 - 1;
                }
                int cellsCount5 = baseSearchResult.getCellsCount();
                for (int i13 = i2; i13 < cellsCount5; i13++) {
                    BaseCellBean item3 = baseSearchResult.getCell(i13);
                    if (!(!q.a((Object) item3.cardType, (Object) "item"))) {
                        if (!item3.isExposed) {
                            break;
                        }
                        q.a((Object) item3, "item");
                        a(item3, sb5, sb4, sb5, sb4);
                    }
                }
            }
        } else {
            sb4 = sb;
            sb5 = sb2;
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        if (sb7.length() > 0) {
            sb7.deleteCharAt(sb7.length() - 1);
        }
        if (sb8.length() > 0) {
            sb8.deleteCharAt(sb8.length() - 1);
        }
        StringBuilder sb12 = sb3;
        if (sb12.length() > 0) {
            sb12.deleteCharAt(sb12.length() - 1);
        }
        if (sb5.length() > 0) {
            sb5.deleteCharAt(sb5.length() - 1);
        }
        if (sb4.length() > 0) {
            sb4.deleteCharAt(sb4.length() - 1);
        }
        String sb13 = sb6.toString();
        q.a((Object) sb13, "exposeIdBuilder.toString()");
        String sb14 = sb7.toString();
        q.a((Object) sb14, "exposeTypeBuilder.toString()");
        String sb15 = sb8.toString();
        q.a((Object) sb15, "unExposeIdBuilder.toString()");
        String sb16 = sb12.toString();
        q.a((Object) sb16, "unExposeTypeBuilder.toString()");
        String sb17 = sb5.toString();
        q.a((Object) sb17, "lastPageExposeIdBuilder.toString()");
        String sb18 = sb4.toString();
        q.a((Object) sb18, "lastPageExposeTypeBuilder.toString()");
        return new b(sb13, sb14, sb15, sb16, sb17, sb18);
    }

    private final void a(BaseCellBean baseCellBean, StringBuilder sb, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17556fa", new Object[]{this, baseCellBean, sb, sb2, sb3, sb4});
        } else if (!q.a((Object) baseCellBean.cardType, (Object) "item")) {
        } else {
            if (baseCellBean.isExposed) {
                sb.append(baseCellBean.itemId);
                sb.append(',');
                if (baseCellBean.isP4p) {
                    sb2.append("p,");
                    return;
                } else {
                    sb2.append("m,");
                    return;
                }
            }
            sb3.append(baseCellBean.itemId);
            sb3.append(',');
            if (baseCellBean.isP4p) {
                sb4.append("p,");
            } else {
                sb4.append("m,");
            }
        }
    }

    public final String b(jxs jarvis) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3074cc", new Object[]{this, jarvis});
        }
        q.c(jarvis, "jarvis");
        jyh buffer = jarvis.h();
        StringBuilder sb = new StringBuilder();
        q.a((Object) buffer, "buffer");
        for (String str : buffer.a().keySet()) {
            if (!jarvis.a(str)) {
                sb.append(str);
                sb.append(',');
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : buffer.b().keySet()) {
            if (!jarvis.a(str2)) {
                sb2.append(str2);
                sb2.append(',');
            }
        }
        HashMap hashMap = new HashMap();
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            String sb3 = sb.toString();
            q.a((Object) sb3, "itemBufferIdsBuilder.toString()");
            hashMap.put("m", sb3);
        }
        if (sb2.length() > 0) {
            z = true;
        }
        if (z) {
            sb2.deleteCharAt(sb2.length() - 1);
            String sb4 = sb2.toString();
            q.a((Object) sb4, "p4pBufferIdsBuilder.toString()");
            hashMap.put("p", sb4);
        }
        String jSONString = JSON.toJSONString(hashMap);
        q.a((Object) jSONString, "JSON.toJSONString(bufferData)");
        return jSONString;
    }

    public final void a(int i, BaseCellBean replaceItem, BaseSearchResult totalResult, jxs jarvis, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc0cda", new Object[]{this, new Integer(i), replaceItem, totalResult, jarvis, jSONObject});
            return;
        }
        q.c(replaceItem, "replaceItem");
        q.c(totalResult, "totalResult");
        q.c(jarvis, "jarvis");
        if (i < 0 || i > totalResult.getCellsCount()) {
            return;
        }
        BaseCellBean baseCellBean = totalResult.getCells().get(i);
        c a2 = jarvis.a(i);
        int a3 = a2 != null ? a2.a() : baseCellBean.pageNo;
        int b = a2 != null ? a2.b() : baseCellBean.pagePos;
        int c = a2 != null ? a2.c() : baseCellBean.pageSize;
        replaceItem.pageNo = a3;
        replaceItem.pagePos = b;
        replaceItem.pageSize = c;
        JSONObject jSONObject2 = null;
        if (replaceItem instanceof SFAuctionBaseCellBean) {
            SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) replaceItem;
            sFAuctionBaseCellBean.auctionBaseBean.page = replaceItem.pageNo;
            sFAuctionBaseCellBean.auctionBaseBean.pagePos = replaceItem.pagePos;
            jSONObject2 = sFAuctionBaseCellBean.auctionBaseBean.utLogMap;
        } else if (replaceItem instanceof MuiseCellBean) {
            jSONObject2 = com.taobao.android.searchbaseframe.util.a.b(((MuiseCellBean) replaceItem).mMuiseBean.model, "utLogMap");
        } else if (replaceItem instanceof M3CellBean) {
            jSONObject2 = ((M3CellBean) replaceItem).getUtLogMap();
        }
        if (jSONObject2 != null) {
            jSONObject2.put("srp_seq", String.valueOf(replaceItem.pageNo));
            jSONObject2.put("srp_pos", String.valueOf(replaceItem.pagePos));
            String str = baseCellBean.itemId;
            q.a((Object) str, "originItem.itemId");
            jSONObject2.put("replaced_nid", str);
            if (baseCellBean.isExposed) {
                jSONObject2.put("replace_expose", "true");
            }
            String str2 = replaceItem.itemId;
            q.a((Object) str2, "replaceItem.itemId");
            a(jSONObject2, jSONObject, str2);
        }
        totalResult.getCells().set(i, replaceItem);
        com.taobao.android.meta.data.a aVar = baseCellBean.combo;
        if (aVar == null) {
            return;
        }
        aVar.a(i, replaceItem);
    }

    private final void a(Map<String, ? super String> map, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab6b37d", new Object[]{this, map, jSONObject, str});
        } else if (jSONObject != null) {
            Object obj = jSONObject.get(str);
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2 == null) {
                return;
            }
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key) && value != null) {
                    q.a((Object) key, "key");
                    map.put(key, value.toString());
                }
            }
        }
    }
}
