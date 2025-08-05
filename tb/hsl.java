package tb;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.LocalMedia;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class hsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String ALL_IMAGE;
    public static final String ALL_MEDIA;
    public static final String ALL_VIDEO;
    public static final Uri QUERY_URI;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f28757a;
        public static final String[] b;

        static {
            kge.a(1917990258);
            f28757a = new String[]{"_id", djy.SERIALIZE_EXP_BUCKET_ID, "bucket_display_name", "date_added", "date_modified", "mime_type", ios.KEY_MEDIA_TYPE, "_data", "COUNT(*) AS count"};
            b = new String[]{"_id", djy.SERIALIZE_EXP_BUCKET_ID, "bucket_display_name", "date_added", "date_modified", "mime_type", ios.KEY_MEDIA_TYPE, "_data"};
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static final String[] PROJECTION;

        static {
            kge.a(-1440622725);
            PROJECTION = new String[]{"_id", djy.SERIALIZE_EXP_BUCKET_ID, "bucket_display_name", "date_added", "date_modified", "mime_type", ios.KEY_MEDIA_TYPE, "_data", "width", "height", "duration", "_size", "orientation"};
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i == 1 ? "media_type=1" : i == 2 ? "media_type=3" : "(media_type=1 OR media_type=3)";
    }

    static {
        kge.a(1327071803);
        QUERY_URI = MediaStore.Files.getContentUri(UiUtil.INPUT_TYPE_VALUE_EXTERNAL);
        ALL_MEDIA = com.alibaba.ability.localization.b.a(R.string.gg_pub_all_files);
        ALL_VIDEO = com.alibaba.ability.localization.b.a(R.string.gg_pub_all_videos);
        ALL_IMAGE = com.alibaba.ability.localization.b.a(R.string.gg_pub_all_photos);
    }

    public static List<MediaBucket> a(Context context, int i, hsp hspVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89902559", new Object[]{context, new Integer(i), hspVar});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return b(context, i, hspVar);
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.f28757a, a(i) + " AND _size>0) GROUP BY (bucket_id", null, "date_modified DESC");
        ArrayList arrayList = new ArrayList();
        if (query != null && query.moveToFirst()) {
            do {
                MediaBucket mediaBucket = new MediaBucket();
                mediaBucket.id = query.getInt(query.getColumnIndex("_id"));
                mediaBucket.bucketId = query.getInt(query.getColumnIndex(djy.SERIALIZE_EXP_BUCKET_ID));
                mediaBucket.displayName = query.getString(query.getColumnIndex("bucket_display_name"));
                mediaBucket.count = query.getInt(query.getColumnIndex("count"));
                mediaBucket.mimeType = query.getString(query.getColumnIndex("mime_type"));
                mediaBucket.mediaType = query.getInt(query.getColumnIndex(ios.KEY_MEDIA_TYPE));
                mediaBucket.uri = b(query);
                mediaBucket.path = query.getString(query.getColumnIndex("_data"));
                if (hspVar != null) {
                    hspVar.a(mediaBucket);
                }
                boolean z = hspVar != null && hspVar.b(mediaBucket);
                if (mediaBucket.uri != null && !z) {
                    arrayList.add(mediaBucket);
                }
            } while (query.moveToNext());
            a(query);
        }
        return arrayList;
    }

    public static List<MediaBucket> b(Context context, int i, hsp hspVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a3aba3f8", new Object[]{context, new Integer(i), hspVar});
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.b, a(i) + " AND _size>0", null, "date_modified DESC");
        ArrayList arrayList = new ArrayList();
        if (query != null && query.moveToFirst()) {
            HashMap hashMap = new HashMap();
            do {
                int i2 = query.getInt(query.getColumnIndex(djy.SERIALIZE_EXP_BUCKET_ID));
                MediaBucket mediaBucket = (MediaBucket) hashMap.get(Integer.valueOf(i2));
                if (mediaBucket != null) {
                    mediaBucket.count++;
                } else {
                    MediaBucket mediaBucket2 = new MediaBucket();
                    mediaBucket2.id = query.getInt(query.getColumnIndex("_id"));
                    mediaBucket2.bucketId = query.getInt(query.getColumnIndex(djy.SERIALIZE_EXP_BUCKET_ID));
                    mediaBucket2.displayName = query.getString(query.getColumnIndex("bucket_display_name"));
                    mediaBucket2.mimeType = query.getString(query.getColumnIndex("mime_type"));
                    mediaBucket2.mediaType = query.getInt(query.getColumnIndex(ios.KEY_MEDIA_TYPE));
                    mediaBucket2.uri = b(query);
                    mediaBucket2.path = query.getString(query.getColumnIndex("_data"));
                    if (hspVar != null) {
                        hspVar.a(mediaBucket2);
                    }
                    boolean z = hspVar != null && hspVar.b(mediaBucket2);
                    if (mediaBucket2.uri != null && !z) {
                        arrayList.add(mediaBucket2);
                        hashMap.put(Integer.valueOf(i2), mediaBucket2);
                    }
                    mediaBucket2.count++;
                }
            } while (query.moveToNext());
            a(query);
        }
        return arrayList;
    }

    public static MediaBucket a(Context context, int i, String str) {
        String str2;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (MediaBucket) ipChange.ipc$dispatch("3608c12", new Object[]{context, new Integer(i), str});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return b(context, i, str);
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.f28757a, a(i) + " AND _size>0) GROUP BY (bucket_id", null, "date_modified DESC");
        Uri uri = null;
        if (query == null) {
            return null;
        }
        int i4 = 0;
        while (query.moveToNext()) {
            i4 += query.getInt(query.getColumnIndex("count"));
        }
        if (query.moveToFirst()) {
            i3 = query.getInt(query.getColumnIndex("_id"));
            uri = b(query);
            str2 = query.getString(query.getColumnIndex("mime_type"));
            i2 = query.getInt(query.getColumnIndex(ios.KEY_MEDIA_TYPE));
        } else {
            str2 = "";
            i2 = 1;
        }
        a(query);
        MediaBucket mediaBucket = new MediaBucket();
        mediaBucket.id = i3;
        mediaBucket.bucketId = -1;
        mediaBucket.displayName = str;
        mediaBucket.uri = uri;
        mediaBucket.count = i4;
        mediaBucket.mimeType = str2;
        mediaBucket.mediaType = i2;
        mediaBucket.bucketType = i;
        return mediaBucket;
    }

    public static MediaBucket b(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaBucket) ipChange.ipc$dispatch("e3e253f1", new Object[]{context, new Integer(i), str});
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.b, a(i) + " AND _size>0", null, "date_modified DESC");
        MediaBucket mediaBucket = null;
        if (query == null) {
            return null;
        }
        while (query.moveToNext()) {
            if (mediaBucket == null) {
                mediaBucket = new MediaBucket();
                mediaBucket.id = query.getInt(query.getColumnIndex("_id"));
                mediaBucket.bucketId = -1;
                mediaBucket.displayName = str;
                mediaBucket.uri = b(query);
                mediaBucket.mimeType = query.getString(query.getColumnIndex("mime_type"));
                mediaBucket.mediaType = query.getInt(query.getColumnIndex(ios.KEY_MEDIA_TYPE));
                mediaBucket.bucketType = i;
            }
            mediaBucket.count++;
        }
        a(query);
        return mediaBucket;
    }

    public static List<Media> a(Context context, MediaBucket mediaBucket, int i, hsp hspVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("59700462", new Object[]{context, mediaBucket, new Integer(i), hspVar}) : a(context, mediaBucket, i, hspVar, true);
    }

    public static List<Media> a(Context context, MediaBucket mediaBucket, int i, hsp hspVar, boolean z) {
        Cursor query;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7df2ae38", new Object[]{context, mediaBucket, new Integer(i), hspVar, new Boolean(z)});
        }
        String str = "date_modified DESC";
        if (-1 == mediaBucket.bucketId) {
            query = context.getContentResolver().query(QUERY_URI, b.PROJECTION, a(i) + " AND _size>0", null, z ? str : "date_modified");
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = QUERY_URI;
            String[] strArr = b.PROJECTION;
            String str2 = a(i) + " AND bucket_id=? AND _size>0";
            String[] strArr2 = {String.valueOf(mediaBucket.bucketId)};
            if (!z) {
                str = "date_modified";
            }
            query = contentResolver.query(uri, strArr, str2, strArr2, str);
        }
        ArrayList<Media> a2 = a(mediaBucket, hspVar, query);
        a(query);
        return a2;
    }

    public static ArrayList<Media> a(MediaBucket mediaBucket, hsp hspVar, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3ee84075", new Object[]{mediaBucket, hspVar, cursor});
        }
        ArrayList<Media> arrayList = new ArrayList<>();
        if (!cursor.moveToFirst()) {
            return arrayList;
        }
        do {
            int i = cursor.getInt(cursor.getColumnIndex(ios.KEY_MEDIA_TYPE));
            LocalMedia localMedia = null;
            if (i == 3) {
                localMedia = new VideoMedia();
                ((VideoMedia) localMedia).duration = cursor.getLong(cursor.getColumnIndex("duration"));
            } else if (i == 1) {
                localMedia = new ImageMedia();
            }
            localMedia.id = cursor.getInt(cursor.getColumnIndex("_id"));
            localMedia.bucketId = cursor.getInt(cursor.getColumnIndex(djy.SERIALIZE_EXP_BUCKET_ID));
            localMedia.displayName = cursor.getString(cursor.getColumnIndex("bucket_display_name"));
            localMedia.mimeType = cursor.getString(cursor.getColumnIndex("mime_type"));
            localMedia.mediaType = cursor.getInt(cursor.getColumnIndex(ios.KEY_MEDIA_TYPE));
            localMedia.uri = b(cursor);
            localMedia.path = cursor.getString(cursor.getColumnIndex("_data"));
            localMedia.width = cursor.getInt(cursor.getColumnIndex("width"));
            localMedia.height = cursor.getInt(cursor.getColumnIndex("height"));
            localMedia.fileSize = cursor.getInt(cursor.getColumnIndex("_size"));
            localMedia.orientation = cursor.getInt(cursor.getColumnIndex("orientation"));
            localMedia.dateAddTime = cursor.getLong(cursor.getColumnIndex("date_added"));
            localMedia.dateModifyTime = cursor.getLong(cursor.getColumnIndex("date_modified"));
            if (hspVar != null) {
                hspVar.a(mediaBucket);
            }
            boolean z = hspVar != null && hspVar.b(localMedia);
            if (localMedia.uri != null && !z) {
                arrayList.add(localMedia);
            }
        } while (cursor.moveToNext());
        return arrayList;
    }

    public static void a(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2912c62f", new Object[]{cursor});
        } else if (cursor == null) {
        } else {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static Uri b(Cursor cursor) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("65afdf05", new Object[]{cursor});
        }
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        if (a(string)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (!b(string)) {
            return null;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        return ContentUris.withAppendedId(uri, j);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            return str.startsWith("image");
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            return str.startsWith("video");
        }
        return false;
    }
}
