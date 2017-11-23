package com.giants.imagepicker;

import android.app.Application;
import android.content.Context;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.monsanto.customer.QionCloud.R;
import org.xutils.image.ImageOptions;
import org.xutils.x;


public class GApp extends Application {

    public static DisplayImageOptions imageLoaderOptions = new DisplayImageOptions.Builder()//
            .showImageOnLoading(R.mipmap.default_image)         //Definir a Imagem EM exibição Durante o download.
            .showImageForEmptyUri(R.mipmap.default_image)       //Definir a Imagem EM exibição Durante o download.
            .showImageOnFail(R.mipmap.default_image)            //Definir o carregamento de Imagens
            .cacheInMemory(true)                                //Definir o carregamento de Imagens
            .cacheOnDisk(true)                                  //Um erro no processo de decodificação para carregar fotos / Imagens.
            .build();                                           //Um erro no processo de decodificação para carregar fotos / Imagens.

    public static ImageOptions xUtilsOptions = new ImageOptions.Builder()//
            .setIgnoreGif(true)                                //Se está no cache de download de Imagens no cartão SD
            .setImageScaleType(ImageView.ScaleType.FIT_CENTER)  //Um erro no processo de decodificação de carregamento de fotos
            .setLoadingDrawableId(R.mipmap.default_image)       //O modo zoom
            .setFailureDrawableId(R.mipmap.default_image)       //O modo zoom
            .build();                                           //Não faça o download Das Imagens mostradas

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration config = ImageLoaderConfiguration.createDefault(this);

        ImageLoader.getInstance().init(config);     //UniversalImageLoaderUniversalimageloader A inicialização
        x.Ext.init(this);                           //O objeto FOI imageoptions
    }
    /**
     * http://blog.csdn.net/yanzhenjie1003/article/details/51818269 android-support-multidex解决65536
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}