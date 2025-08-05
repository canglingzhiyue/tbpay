package com.taobao.browser.jsbridge.ui.chooseImg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.taobao.windvane.util.m;
import android.view.WindowManager;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import tb.kge;

/* loaded from: classes6.dex */
public class ImgChooseUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;

    static {
        kge.a(114922578);
    }

    public static /* synthetic */ int access$000(ImgChooseUtils imgChooseUtils) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28eae78b", new Object[]{imgChooseUtils})).intValue() : imgChooseUtils.getPicWidth();
    }

    public static /* synthetic */ Bitmap access$100(ImgChooseUtils imgChooseUtils, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("be34857f", new Object[]{imgChooseUtils, str, new Integer(i), new Integer(i2)}) : imgChooseUtils.decodeThumbBitmapForFile(str, i, i2);
    }

    public ImgChooseUtils(Context context) {
        this.context = context;
    }

    public ArrayList<String> listAlldir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d7d52a6b", new Object[]{this});
        }
        Uri data = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI).getData();
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor query = this.context.getContentResolver().query(data, new String[]{"_data"}, null, null, null);
        while (query.moveToNext()) {
            arrayList.add(new File(query.getString(0)).getAbsolutePath());
        }
        query.close();
        return arrayList;
    }

    public List<FileTraversal> LocalImgFileList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db7258ce", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> listAlldir = listAlldir();
        ArrayList arrayList2 = new ArrayList();
        if (listAlldir != null) {
            TreeSet treeSet = new TreeSet();
            for (int i = 0; i < listAlldir.size(); i++) {
                arrayList2.add(getfileinfo(listAlldir.get(i)));
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                treeSet.add(arrayList2.get(i2));
            }
            String[] strArr = (String[]) treeSet.toArray(new String[0]);
            for (String str : strArr) {
                FileTraversal fileTraversal = new FileTraversal();
                fileTraversal.fileName = str;
                arrayList.add(fileTraversal);
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                for (int i4 = 0; i4 < listAlldir.size(); i4++) {
                    if (((FileTraversal) arrayList.get(i3)).fileName.equals(getfileinfo(listAlldir.get(i4)))) {
                        ((FileTraversal) arrayList.get(i3)).fileContent.add(listAlldir.get(i4));
                    }
                }
            }
        }
        return arrayList;
    }

    private Bitmap makeThumbBitmap(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8746b466", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = computeScale(options, i, i2);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeFile(str, options);
    }

    private int computeScale(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52d14e0b", new Object[]{this, options, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0 || i == 0) {
            return 1;
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 <= i && i4 <= i) {
            return 1;
        }
        float f = i;
        int round = Math.round(i3 / f);
        int round2 = Math.round(i4 / f);
        return round < round2 ? round : round2;
    }

    private Bitmap decodeThumbBitmapForFile(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("8bb2f89d", new Object[]{this, str, new Integer(i), new Integer(i2)}) : ThumbnailUtils.extractThumbnail(makeThumbBitmap(str, i, i2), i, i2);
    }

    private int getPicWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd2c7b4c", new Object[]{this})).intValue() : ((WindowManager) this.context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth() / 3;
    }

    public void showNotiDlg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16db20dd", new Object[]{this, str});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setMessage(str);
        builder.setTitle("提示");
        builder.setCancelable(true);
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.ImgChooseUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                }
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.ImgChooseUtils.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                }
            }
        });
        builder.create();
        builder.show();
    }

    public String getfileinfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ae3c8af", new Object[]{this, str});
        }
        String[] split = str.split("/");
        return split[split.length - 2];
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.context = null;
        }
    }

    public void imgExcute(ImgHolder imgHolder, ImgCallBack imgCallBack, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f43b67", new Object[]{this, imgHolder, imgCallBack, str});
            return;
        }
        try {
            new LoadBitAsynk(imgHolder.imageView, imgCallBack).execute(str);
        } catch (Exception unused) {
            Context context = this.context;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
            if (!m.a()) {
                return;
            }
            m.e("multiPhotoPick", "imgExcute Failed!");
        }
    }

    /* loaded from: classes6.dex */
    public class LoadBitAsynk extends AsyncTask<String, Integer, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ImgCallBack icb;
        public ImageView imageView;

        static {
            kge.a(1417435055);
        }

        public static /* synthetic */ Object ipc$super(LoadBitAsynk loadBitAsynk, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute((LoadBitAsynk) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public LoadBitAsynk(ImageView imageView, ImgCallBack imgCallBack) {
            this.imageView = imageView;
            this.icb = imgCallBack;
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("661fa7f8", new Object[]{this, strArr});
            }
            Bitmap bitmap = null;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        int access$000 = ImgChooseUtils.access$000(ImgChooseUtils.this);
                        bitmap = ImgChooseUtils.access$100(ImgChooseUtils.this, strArr[i], access$000, access$000);
                    } catch (Exception unused) {
                        m.e("multiPhotoPick", "Create bitamp " + strArr[i] + " Failed!");
                    }
                }
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                return;
            }
            super.onPostExecute((LoadBitAsynk) bitmap);
            if (bitmap == null) {
                return;
            }
            this.icb.resultImgCall(this.imageView, bitmap);
        }
    }
}
