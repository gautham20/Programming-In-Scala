val lunch = if (args.length > 0) args(0) else ""

val action = 
	lunch match {
		case "biriyani" =>	"get in sahitis"
		case "naan" => "get in muscat"
		case "pizze" => "get in dominos"
		case _ => "prepare chocos and eat"
	}

println(action)