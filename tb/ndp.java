package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.contentprovider.TBLocationContentProvider;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public class ndp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LinkedBlockingQueue<LBSDTO> f31370a;
    private static LBSDTO b;
    private Context c;

    static {
        kge.a(-382363782);
        f31370a = new LinkedBlockingQueue<>(5);
    }

    public ndp(Context context) {
        this.c = context;
    }

    public static void a(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bf1e90", new Object[]{lbsdto});
        } else {
            b = lbsdto;
        }
    }

    public static void b(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93944d1", new Object[]{lbsdto});
            return;
        }
        synchronized (ndp.class) {
            if (f31370a.size() < 5) {
                if (f31370a.offer(lbsdto)) {
                }
            } else if (f31370a.size() == 5) {
                f31370a.poll();
                if (f31370a.offer(lbsdto)) {
                }
            }
        }
    }

    public static LBSDTO a() {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("80276e16", new Object[0]);
        }
        if (b == null) {
            try {
                cursor = Globals.getApplication().getContentResolver().query(TBLocationContentProvider.CONTENT_URI, null, null, null, "_id DESC LIMIT 1");
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndex("name"));
                            if (!TextUtils.isEmpty(string)) {
                                b = (LBSDTO) JSONObject.parseObject(string, LBSDTO.class);
                            }
                        }
                    } catch (Exception unused) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } else if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception unused2) {
                cursor = null;
            } catch (Throwable th3) {
                cursor = null;
                th = th3;
            }
        }
        return b;
    }

    public void a(ContentResolver contentResolver, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2831998", new Object[]{this, contentResolver, lbsdto});
            return;
        }
        try {
            LBSDTO a2 = a();
            if (lbsdto != null && a2 != null && lbsdto.compareTo(a2) == 0) {
                lbsdto.setTimeOnly(true);
            }
            a(lbsdto);
            b(lbsdto);
            ContentValues contentValues = new ContentValues();
            String jSONString = JSON.toJSONString(lbsdto);
            if (TextUtils.isEmpty(jSONString)) {
                return;
            }
            contentValues.put("name", jSONString);
            contentResolver.insert(TBLocationContentProvider.CONTENT_URI, contentValues);
        } catch (Exception e) {
            Log.e("DataStorager", "save location data error: " + e.getMessage());
        }
    }

    public Location a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Location) ipChange.ipc$dispatch("8f86928b", new Object[]{this, new Integer(i), new Long(j)});
        }
        Location location = null;
        try {
            LocationManager locationManager = (LocationManager) this.c.getSystemService("location");
            long j2 = Long.MIN_VALUE;
            float f = Float.MAX_VALUE;
            for (String str : locationManager.getAllProviders()) {
                Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                if (lastKnownLocation != null) {
                    float accuracy = lastKnownLocation.getAccuracy();
                    long time = lastKnownLocation.getTime();
                    int i2 = (time > j ? 1 : (time == j ? 0 : -1));
                    if (i2 > 0 && accuracy < f) {
                        location = lastKnownLocation;
                        f = accuracy;
                    } else if (i2 < 0 && f == Float.MAX_VALUE && time > j2) {
                        location = lastKnownLocation;
                    }
                    j2 = time;
                }
            }
        } catch (Exception e) {
            String str2 = "getLastBestLocation error: " + e.getMessage();
        }
        return location;
    }
}
