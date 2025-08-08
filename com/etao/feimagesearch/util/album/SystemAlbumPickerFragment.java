package com.etao.feimagesearch.util.album;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.album.a;
import com.etao.feimagesearch.util.t;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.cou;
import tb.cox;
import tb.coy;
import tb.cpk;
import tb.csz;
import tb.kge;

/* loaded from: classes4.dex */
public final class SystemAlbumPickerFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int REQUEST_CODE_SYSTEM_SINGLE_PICK = 293;
    private a.InterfaceC0249a albumPickCallback;
    private String pssource;

    static {
        kge.a(1714591488);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(SystemAlbumPickerFragment systemAlbumPickerFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1257714799) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(850510408);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public static /* synthetic */ void pickSingleAlbumSrc$default(SystemAlbumPickerFragment systemAlbumPickerFragment, boolean z, a.InterfaceC0249a interfaceC0249a, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7219b5c9", new Object[]{systemAlbumPickerFragment, new Boolean(z), interfaceC0249a, str, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            interfaceC0249a = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        systemAlbumPickerFragment.pickSingleAlbumSrc(z, interfaceC0249a, str);
    }

    public final void pickSingleAlbumSrc(boolean z, a.InterfaceC0249a interfaceC0249a, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93fa67c", new Object[]{this, new Boolean(z), interfaceC0249a, str});
            return;
        }
        this.albumPickCallback = interfaceC0249a;
        this.pssource = str;
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if (z) {
            intent.setType("image/*;video/mp4");
        } else {
            intent.setType("image/*");
        }
        startActivityForResult(Intent.createChooser(intent, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18991)), 293);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (intent == null || i2 != -1 || i != 293) {
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            FragmentActivity activity = getActivity();
            q.a((Object) activity, "activity");
            String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19014);
            q.a((Object) a2, "Localization.localizedSt….taobao_app_1007_1_19014)");
            showErrorToast(activity, a2);
            return;
        }
        String path = data.getPath();
        if (path == null) {
            path = "";
        }
        q.a((Object) path, "uri.path ?: \"\"");
        String type = intent.getType();
        if (type == null) {
            type = "";
        }
        q.a((Object) type, "data.type ?: \"\"");
        String str = type;
        if (StringUtils.isEmpty(str)) {
            String str2 = path;
            if (StringUtils.isEmpty(str2) || (!n.b((CharSequence) str2, (CharSequence) "video", false, 2, (Object) null) && !n.b((CharSequence) str2, (CharSequence) "Video", false, 2, (Object) null) && !n.b((CharSequence) str2, (CharSequence) "VID", false, 2, (Object) null) && !n.b((CharSequence) str2, (CharSequence) MspEventTypes.ACTION_STRING_VID, false, 2, (Object) null))) {
                z = false;
            }
        } else {
            z = n.b((CharSequence) str, (CharSequence) "video", false, 2, (Object) null);
        }
        FragmentActivity activity2 = getActivity();
        q.a((Object) activity2, "activity");
        com.etao.feimagesearch.album.o a3 = t.a(activity2, data, z);
        if (a3 == null) {
            Context context = getContext();
            q.a((Object) context, "context");
            String a4 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19012);
            q.a((Object) a4, "Localization.localizedSt….taobao_app_1007_1_19012)");
            showErrorToast(context, a4);
            return;
        }
        a3.a(data);
        FragmentActivity activity3 = getActivity();
        q.a((Object) activity3, "activity");
        processMediaItem(activity3, a3);
    }

    private final void processMediaItem(Activity activity, com.etao.feimagesearch.album.o oVar) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b840f070", new Object[]{this, activity, oVar});
        } else if (activity.isFinishing()) {
        } else {
            if (oVar.c() && videoFilePreProcess(activity, oVar)) {
                return;
            }
            if (oVar.c()) {
                a2 = "video";
            } else {
                if (com.etao.feimagesearch.album.q.a(oVar.h())) {
                    a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18944);
                } else {
                    a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18966);
                }
                q.a((Object) a2, "if (QueryMediaTask.isScr….taobao_app_1007_1_18966)");
            }
            coy.b(cpk.ALBUM_PAGE_NAME, "SelectedPhoto", "pssource=" + this.pssource, "picCreateTime=" + oVar.f(), "picIndex=" + oVar.k(), "query_type=" + a2);
            a.InterfaceC0249a interfaceC0249a = this.albumPickCallback;
            if (interfaceC0249a == null) {
                return;
            }
            interfaceC0249a.a(oVar);
        }
    }

    private final boolean videoFilePreProcess(Activity activity, com.etao.feimagesearch.album.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5dc678f", new Object[]{this, activity, oVar})).booleanValue();
        }
        String h = oVar.h();
        q.a((Object) h, "item.path");
        if (!n.c(h, f.FILE_TYPE_VIDEO_MP4, false, 2, (Object) null)) {
            String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19000);
            q.a((Object) a2, "Localization.localizedSt….taobao_app_1007_1_19000)");
            showErrorToast(activity, a2);
            return true;
        } else if (!oVar.a(com.etao.feimagesearch.config.b.l())) {
            csz.a(oVar.e(), false);
            showErrorToast(activity, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_not_supported_now) + com.etao.feimagesearch.config.b.l() + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19020));
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(oVar.e()));
            return true;
        } else if (oVar.a()) {
            csz.a(oVar.e(), false);
            String a3 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19024);
            q.a((Object) a3, "Localization.localizedSt….taobao_app_1007_1_19024)");
            showErrorToast(activity, a3);
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(oVar.e()));
            return true;
        } else {
            boolean equals = StringUtils.equals(this.pssource, "sys_album");
            cox.a("SelectedVideo", new String[0]);
            csz.a(oVar.e(), true);
            if (!equals) {
                return false;
            }
            String uri = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(oVar.h())).appendQueryParameter("pssource", this.pssource).build().toString();
            q.a((Object) uri, "Uri.parse(\"https://m.tao…ource).build().toString()");
            cou.a(activity, uri);
            return true;
        }
    }

    private final void showErrorToast(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c654f", new Object[]{this, context, str});
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }
}
