import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/goods")
public class GoodsService implements Serializable {

    private static Map<Integer, Goods> goodsMap = new HashMap<>();
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Goods getGoods(@PathParam("id") Integer id){
        return goodsMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createGoods(Goods good) {
        goodsMap.put(good.getId(), good);
        return Response.status(200).entity("Good").build();
    }
    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteGoods(@PathParam("id") Integer id){
        goodsMap.remove(id);
        return Response.status(200).entity("Good").build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateGoods(Goods goods){
        goodsMap.put(goods.getId(), goods);
        return Response.status(200).entity("Good").build();
    }
}


