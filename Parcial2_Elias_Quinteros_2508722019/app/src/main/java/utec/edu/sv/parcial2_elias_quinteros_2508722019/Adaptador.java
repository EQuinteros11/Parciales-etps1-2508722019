package utec.edu.sv.parcial2_elias_quinteros_2508722019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
    Context contexto;
    int layout;
    List<String> info;
    List<String> cargo;
    List<String> compa;
    int[]imagenes;


    public Adaptador(Context contexto, int layout, List<String> info, List<String> cargo, List<String> compa, int[] imagenes) {
        this.contexto = contexto;
        this.layout = layout;
        this.info = info;
        this.cargo = cargo;
        this.compa = compa;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return info.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(contexto);
        v = layoutInflater.inflate(R.layout.elementos, null);

        TextView txtinfo = v.findViewById(R.id.tvNombre);
        txtinfo.setText(info.get(position));

        TextView txtcargo = v.findViewById(R.id.tvCargo);
        txtcargo.setText(cargo.get(position));

        TextView txtcompa = v.findViewById(R.id.tvCompa);
        txtcompa.setText(compa.get(position));


        ImageView img = v.findViewById(R.id.imageView);
        img.setImageResource(imagenes[position]);
        return v;
    }
}
