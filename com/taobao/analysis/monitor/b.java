package com.taobao.analysis.monitor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mto;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f8585a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f8586a = new b();

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8639dccc", new Object[0]) : f8586a;
        }
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8639dccc", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f8585a = new c(context, c.DATABASE_NAME).getWritableDatabase();
        if (this.f8585a == null) {
            return;
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.monitor.b.b():void");
    }

    public void a(double d, String str, int i) {
        int i2;
        double d2 = d;
        IpChange ipChange = $ipChange;
        int i3 = 3;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9835e3", new Object[]{this, new Double(d2), str, new Integer(i)});
            return;
        }
        ALog.d("falco.MultiPathFlowDb", "start update db data", null, new Object[0]);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Cursor query = this.f8585a.query(c.MULTI_PATH_FLOW_TASK_TABLE_NAME, null, "date = ? and host = ? and flowType = ?", new String[]{format, str, String.valueOf(i)}, null, null, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    try {
                        int columnIndex = query.getColumnIndex("date");
                        int columnIndex2 = query.getColumnIndex("useFlowSize");
                        while (query.moveToNext()) {
                            if (format.equals(query.getString(columnIndex))) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("useFlowSize", Double.valueOf(query.getDouble(columnIndex2) + d2));
                                String[] strArr = new String[i3];
                                strArr[0] = format;
                                strArr[1] = str;
                                strArr[2] = String.valueOf(i);
                                if (this.f8585a.update(c.MULTI_PATH_FLOW_TASK_TABLE_NAME, contentValues, "date = ? and host = ? and flowType = ?", strArr) <= 0 && ALog.isPrintLog(2)) {
                                    ALog.i("falco.MultiPathFlowDb", "update table failed", null, "date", format);
                                }
                                ALog.d("falco.MultiPathFlowDb", "update db data success", null, new Object[0]);
                                d2 = d;
                                i3 = 3;
                            } else {
                                d2 = d;
                            }
                        }
                        if (query == null) {
                            return;
                        }
                    } catch (Exception e) {
                        ALog.e("falco.MultiPathFlowDb", "no first insert utdid, doOperation failed", null, e, new Object[0]);
                        if (query == null) {
                            return;
                        }
                    }
                    query.close();
                    return;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("flowType", Integer.valueOf(i));
            contentValues2.put("date", format);
            contentValues2.put("useFlowSize", Double.valueOf(d));
            contentValues2.put("host", str);
            contentValues2.put("flag", (Integer) 0);
            if (this.f8585a.insert(c.MULTI_PATH_FLOW_TASK_TABLE_NAME, null, contentValues2) == -1 && ALog.isPrintLog(2)) {
                ALog.i("falco.MultiPathFlowDb", "insert table failed", null, "date", format);
            }
            i2 = 0;
            try {
                ALog.d("falco.MultiPathFlowDb", "insert db data success", null, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                ALog.e("falco.MultiPathFlowDb", "first insert utdid, doOperation failed", null, e, new Object[i2]);
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 0;
        }
    }

    private void a(HashMap<String, HashMap<String, Double>> hashMap, int i) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480c4018", new Object[]{this, hashMap, new Integer(i)});
            return;
        }
        for (String str : hashMap.keySet()) {
            MultiPathFlowStatistic multiPathFlowStatistic = new MultiPathFlowStatistic();
            multiPathFlowStatistic.date = str;
            HashMap<String, Double> hashMap2 = hashMap.get(str);
            double d = mto.a.GEO_NOT_SUPPORT;
            JSONObject jSONObject = new JSONObject();
            for (String str2 : hashMap2.keySet()) {
                double doubleValue = hashMap2.get(str2).doubleValue();
                jSONObject.put(str2, doubleValue);
                d += doubleValue;
            }
            multiPathFlowStatistic.ipList = jSONObject.toString();
            multiPathFlowStatistic.dayFlowSize = d;
            multiPathFlowStatistic.flowType = i;
            AppMonitor.getInstance().commitStat(multiPathFlowStatistic);
        }
    }
}
