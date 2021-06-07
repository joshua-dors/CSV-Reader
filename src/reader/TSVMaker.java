package reader;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TSVMaker {

	static String bodyType;

	static String value = null;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();
		
		TSVMaker runner = new TSVMaker();
		
		// SET CSV/TSV LENGTH
		int csv_length = 130;

		// filename
		String filename = "/Users/joshuadors/Desktop/Makes.tsv";

		// reading in file from url(filename)
		Scanner sc = new Scanner(new File(filename));

		// array to store csv
		String[] storeValues = new String[csv_length];

		// new output file
		FileWriter myWriter = new FileWriter("/Users/joshuadors/Desktop/BodyTypes_UPDATED.csv");

		int i = 0;

		while (sc.hasNext()) {
			storeValues[i] = sc.next();
			i++;
		}

		sc.close(); // closes the scanner

		for (int j = 0; j < storeValues.length; j++) {
			runner.exporter(storeValues[j]);

			try {
				myWriter.write(storeValues[j] + ", " + bodyType + "\n");
			} finally {
			}
			bodyType = null;
		}
		myWriter.close();

		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		double seconds = (double) totalTime / 1_000_000_000.0;
		System.out.println("Done in: " + seconds + "s");
		System.out.println("---");
		System.out.println("File created: BodyTypes_UPDATED.csv");
	}

	public void exporter(String value) {

		if (value.contains("honda-civic")) {
			bodyType = "Sedan";
		}
		if (value.contains("harley-davidson-flhtk-electra-glide-ultra-limited")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("lexus-gs-350")) {
			bodyType = "Sedan";
		}
		if (value.contains("toyota-c-hr")) {
			bodyType = "Crossover";
		}
		if (value.contains("mclaren-570s")) {
			bodyType = "Coupe";
		}
		if (value.contains("bmw-i8")) {
			bodyType = "Hybrid/Electric";
		}
		if (value.contains("buick-encore")) {
			bodyType = "Crossover";
		}
		if (value.contains("mercedes-benz-ml-350")) {
			bodyType = "SUV";
		}
		if (value.contains("cadillac-ct6")) {
			bodyType = "Sedan";
		}
		if (value.contains("infiniti-q60")) {
			bodyType = "Coupe";
		}
		if (value.contains("damon-motor-coach-daybreak-class-a-motorhome")) {
			bodyType = "RV";
		}
		if (value.contains("harley-davidson-street-glide")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("aston-martin-v8-vantage")) {
			bodyType = "Coupe";
		}
		if (value.contains("keystone-rv-passport")) {
			bodyType = "Coupe";
		}
		if (value.contains("bmw-3-series")) {
			bodyType = "Sedan";
		}
		if (value.contains("ford-f-150")) {
			bodyType = "Truck";
		}
		if (value.contains("mercedes-benz-g-class")) {
			bodyType = "SUV";
		}
		if (value.contains("mercedes-benz-c-class")) {
			bodyType = "Sedan";
		}
		if (value.contains("mercedes-benz-s-class")) {
			bodyType = "Sedan";
		}
		if (value.contains("bmw-x5")) {
			bodyType = "SUV";
		}
		if (value.contains("toyota-corolla")) {
			bodyType = "Sedan";
		}
		if (value.contains("land-rover-range-rover")) {
			bodyType = "SUV";
		}
		if (value.contains("porsche-911")) {
			bodyType = "Coupe";
		}
		if (value.contains("dodge-ram-3500")) {
			bodyType = "Truck";
		}
		if (value.contains("volkswagen-jetta")) {
			bodyType = "Sedan";
		}
		if (value.contains("honda-cr-v")) {
			bodyType = "Crossover";
		}
		if (value.contains("chevrolet-cruze")) {
			bodyType = "Sedan";
		}
		if (value.contains("international-24-passenger-bus-diesel-with-air-brakes")) {
			bodyType = "Bus";
		}
		if (value.contains("dodge-grand-caravan")) {
			bodyType = "Minivan";
		}
		if (value.contains("mazda-mazda3")) {
			bodyType = "Hatch";
		}
		if (value.contains("ford-mustang")) {
			bodyType = "Coupe";
		}
		if (value.contains("hyundai-elantra")) {
			bodyType = "Sedan";
		}
		if (value.contains("homestead-26rl")) {
			bodyType = "Trailer";
		}
		if (value.contains("toyota-rav4")) {
			bodyType = "Crossover";
		}
		if (value.contains("bentley-continental")) {
			bodyType = "Convertible";
		}
		if (value.contains("ford-escape")) {
			bodyType = "SUV";
		}
		if (value.contains("fisker-karma")) {
			bodyType = "Sedan";
		}
		if (value.contains("honda-accord")) {
			bodyType = "Sedan";
		}
		if (value.contains("toyota-camry")) {
			bodyType = "Sedan";
		}
		if (value.contains("mercedes-benz-e-class")) {
			bodyType = "Sedan";
		}
		if (value.contains("dodge-ram-1500")) {
			bodyType = "Truck";
		}
		if (value.contains("hyundai-santa-fe")) {
			bodyType = "SUV";
		}
		if (value.contains("jeep-wrangler")) {
			bodyType = "SUV";
		}
		if (value.contains("nissan-rogue")) {
			bodyType = "Crossover";
		}
		if (value.contains("volkswagen-passat")) {
			bodyType = "Sedan";
		}
		if (value.contains("bmw-4-series")) {
			bodyType = "Coupe";
		}
		if (value.contains("honda-pilot")) {
			bodyType = "SUV";
		}
		if (value.contains("audi-q5")) {
			bodyType = "SUV";
		}
		if (value.contains("gmc-sierra-1500")) {
			bodyType = "Truck";
		}
		if (value.contains("audi-a4")) {
			bodyType = "Sedan";
		}
		if (value.contains("cadillac-escalade")) {
			bodyType = "SUV";
		}
		if (value.contains("ram-1500")) {
			bodyType = "Truck";
		}
		if (value.contains("jeep-grand-cherokee")) {
			bodyType = "SUV";
		}
		if (value.contains("lexus-rx-350")) {
			bodyType = "SUV";
		}
		if (value.contains("chevrolet-silverado-1500")) {
			bodyType = "Truck";
		}
		if (value.contains("prevost-h3-40")) {
			bodyType = "Bus";
		}
		if (value.contains("audi-q7")) {
			bodyType = "SUV";
		}
		if (value.contains("ford-explorer")) {
			bodyType = "Crossover";
		}
		if (value.contains("bmw-5-series")) {
			bodyType = "Sedan";
		}
		if (value.contains("land-rover-evoque")) {
			bodyType = "SUV";
		}
		if (value.contains("acura-mdx")) {
			bodyType = "SUV";
		}
		if (value.contains("mercedes-benz-cla-class")) {
			bodyType = "Coupe";
		}
		if (value.contains("dodge-journey")) {
			bodyType = "Crossover";
		}
		if (value.contains("dodge-charger")) {
			bodyType = "Sedan";
		}
		if (value.contains("ford-focus")) {
			bodyType = "Hatch";
		}
		if (value.contains("kia-sorento")) {
			bodyType = "Crossover";
		}
		if (value.contains("volkswagen-golf")) {
			bodyType = "Hatch";
		}
		if (value.contains("subaru-impreza")) {
			bodyType = "Hatch";
		}
		if (value.contains("ford-f-350")) {
			bodyType = "Truck";
		}
		if (value.contains("toyota-highlander")) {
			bodyType = "SUV";
		}
		if (value.contains("hyundai-sonata")) {
			bodyType = "Sedan";
		}
		if (value.contains("porsche-cayenne")) {
			bodyType = "SUV";
		}
		if (value.contains("hyundai-tucson")) {
			bodyType = "Crossover";
		}
		if (value.contains("dodge-challenger")) {
			bodyType = "Coupe";
		}
		if (value.contains("toyota-sienna")) {
			bodyType = "Minivan";
		}
		if (value.contains("mercedes-benz-sprinter")) {
			bodyType = "Van";
		}
		if (value.contains("volkswagen-tiguan")) {
			bodyType = "Crossover";
		}
		if (value.contains("ford-edge")) {
			bodyType = "Crossover";
		}
		if (value.contains("honda-odyssey")) {
			bodyType = "Van";
		}
		if (value.contains("chevrolet-camaro")) {
			bodyType = "Coupe";
		}
		if (value.contains("gulf-stream-36-fte")) {
			bodyType = "Trailer";
		}
		if (value.contains("nissan-altima")) {
			bodyType = "Sedan";
		}
		if (value.contains("baja-outlaw")) {
			bodyType = "Boat";
		}
		if (value.contains("nissan-sentra")) {
			bodyType = "Sedan";
		}
		if (value.contains("mercedes-benz-gl-class")) {
			bodyType = "SUV";
		}
		if (value.contains("dodge-durango")) {
			bodyType = "SUV";
		}
		if (value.contains("ford-f-250")) {
			bodyType = "Truck";
		}
		if (value.contains("toyota-tacoma")) {
			bodyType = "Truck";
		}
		if (value.contains("porsche-macan")) {
			bodyType = "SUV";
		}
		if (value.contains("cadillac-ats")) {
			bodyType = "Sedan";
		}
		if (value.contains("bmw-m3")) {
			bodyType = "Sedan";
		}
		if (value.contains("volkswagen-touareg")) {
			bodyType = "Crossover";
		}
		if (value.contains("mercedes-benz-sl-class")) {
			bodyType = "Convertible";
		}
		if (value.contains("mercedes-benz-r-class")) {
			bodyType = "Minivan";
		}
		if (value.contains("mini-cooper")) {
			bodyType = "Hatch";
		}
		if (value.contains("dodge-caliber")) {
			bodyType = "Hatch";
		}
		if (value.contains("mercedes-benz-glk-class")) {
			bodyType = "SUV";
		}
		if (value.contains("hyundai-accent")) {
			bodyType = "Sedan";
		}
		if (value.contains("audi-a3")) {
			bodyType = "Sedan";
		}
		if (value.contains("chrysler-300")) {
			bodyType = "Sedan";
		}
		if (value.contains("bmw-x3")) {
			bodyType = "Crossover";
		}
		if (value.contains("ford-fusion")) {
			bodyType = "Sedan";
		}
		if (value.contains("chevrolet-silverado-2500")) {
			bodyType = "Truck";
		}
		if (value.contains("porsche-boxster")) {
			bodyType = "Coupe";
		}
		if (value.contains("subaru-wrx")) {
			bodyType = "Sedan";
		}
		if (value.contains("adventure-adda-bunkhouse--lil-b")) {
			bodyType = "Trailer";
		}
		if (value.contains("mitsubishi-lancer")) {
			bodyType = "Sedan";
		}
		if (value.contains("toyota-mirai")) {
			bodyType = "Hybrid/Electric";
		}
		if (value.contains("mandalay-coach-presido")) {
			bodyType = "RV";
		}
		if (value.contains("bmw-7-series")) {
			bodyType = "Sedan";
		}
		if (value.contains("mazda-rx-8")) {
			bodyType = "Coupe";
		}
		if (value.contains("chevrolet-corvette")) {
			bodyType = "Coupe";
		}
		if (value.contains("silverton-marine-40-convertible")) {
			bodyType = "Boat";
		}
		if (value.contains("kia-forte")) {
			bodyType = "Sedan";
		}
		if (value.contains("nissan-frontier")) {
			bodyType = "Truck";
		}
		if (value.contains("nissan-pathfinder")) {
			bodyType = "SUV";
		}
		if (value.contains("jeep-cherokee")) {
			bodyType = "SUV";
		}
		if (value.contains("jaguar-xj")) {
			bodyType = "Sedan";
		}
		if (value.contains("maserati-ghibli")) {
			bodyType = "Sedan";
		}
		if (value.contains("gmc-terrain")) {
			bodyType = "Crossover";
		}
		if (value.contains("mercedes-benz-gle")) {
			bodyType = "SUV";
		}
		if (value.contains("acura-rdx")) {
			bodyType = "Crossover";
		}
		if (value.contains("subaru-outback")) {
			bodyType = "Crossover";
		}
		if (value.contains("chevrolet-avalanche")) {
			bodyType = "SUV";
		}
		if (value.contains("gmc-savana")) {
			bodyType = "Van";
		}
		if (value.contains("toyota-venza")) {
			bodyType = "Hybrid";
		}
		if (value.contains("toyota-4runner")) {
			bodyType = "SUV";
		}
		if (value.contains("chevrolet-equinox")) {
			bodyType = "Crossover";
		}
		if (value.contains("gmc-sierra-2500")) {
			bodyType = "Truck";
		}
		if (value.contains("mercedes-benz-gla")) {
			bodyType = "Crossover";
		}
		if (value.contains("kia-optima")) {
			bodyType = "Sedan";
		}
		if (value.contains("toyota-matrix")) {
			bodyType = "Hatch";
		}
		if (value.contains("kia-soul")) {
			bodyType = "Crossover";
		}
		if (value.contains("toyota-86")) {
			bodyType = "Coupe";
		}
		if (value.contains("ford-ranger")) {
			bodyType = "Truck";
		}
		if (value.contains("gmc-acadia")) {
			bodyType = "SUV";
		}
		if (value.contains("audi-a8")) {
			bodyType = "Sedan";
		}
		if (value.contains("chevrolet-impala")) {
			bodyType = "Sedan";
		}
		if (value.contains("mitsubishi-outlander")) {
			bodyType = "Crossover";
		}
		if (value.contains("mercedes-benz-ml-class")) {
			bodyType = "SUV";
		}
		if (value.contains("nissan-versa")) {
			bodyType = "Sedan";
		}
		if (value.contains("ram-3500")) {
			bodyType = "Truck";
		}
		if (value.contains("coachmen-clipper")) {
			bodyType = "RV";
		}
		if (value.contains("cadillac-cts")) {
			bodyType = "Sedan";
		}
		if (value.contains("bmw-x6")) {
			bodyType = "Crossover";
		}
		if (value.contains("bmw-6-series")) {
			bodyType = "Coupe";
		}
		if (value.contains("mitsubishi-rvr")) {
			bodyType = "Crossover";
		}
		if (value.contains("bmw-x1")) {
			bodyType = "Crossover";
		}
		if (value.contains("audi-r8")) {
			bodyType = "Coupe";
		}
		if (value.contains("ford-fiesta")) {
			bodyType = "Hatch";
		}
		if (value.contains("nissan-murano")) {
			bodyType = "Crossover";
		}
		if (value.contains("ford-transit")) {
			bodyType = "Van";
		}
		if (value.contains("toyota-yaris")) {
			bodyType = "Hatch";
		}
		if (value.contains("fiat-500")) {
			bodyType = "Hatch";
		}
		if (value.contains("audi-a7")) {
			bodyType = "Sedan";
		}
		if (value.contains("jeep-patriot")) {
			bodyType = "Crossover";
		}
		if (value.contains("jaguar-xe")) {
			bodyType = "Sedan";
		}
		if (value.contains("hummer-h2")) {
			bodyType = "SUV";
		}
		if (value.contains("chevrolet-silverado-3500")) {
			bodyType = "Truck";
		}
		if (value.contains("audi-s5")) {
			bodyType = "Sedan";
		}
		if (value.contains("land-rover-range-rover-sport")) {
			bodyType = "SUV";
		}
		if (value.contains("subaru-forester")) {
			bodyType = "Crossover";
		}
		if (value.contains("mazda-cx-7")) {
			bodyType = "Crossover";
		}
		if (value.contains("kia-sportage")) {
			bodyType = "Crossover";
		}
		if (value.contains("jeep-compass")) {
			bodyType = "Crossover";
		}
		if (value.contains("lexus-is-250")) {
			bodyType = "Sedan";
		}
		if (value.contains("chevrolet-malibu")) {
			bodyType = "Sedan";
		}
		if (value.contains("infiniti-qx60")) {
			bodyType = "Crossover";
		}
		if (value.contains("infiniti-g37")) {
			bodyType = "Coupe";
		}
		if (value.contains("ford-transit-connect")) {
			bodyType = "Van";
		}
		if (value.contains("mazda-cx-5")) {
			bodyType = "Crossover";
		}
		if (value.contains("acura-tl")) {
			bodyType = "Sedan";
		}
		if (value.contains("toyota-tundra")) {
			bodyType = "Truck";
		}
		if (value.contains("gmc-yukon-xl")) {
			bodyType = "SUV";
		}
		if (value.contains("mercedes-benz-b-class")) {
			bodyType = "Hatch";
		}
		if (value.contains("mercedes-benz-c63-amg")) {
			bodyType = "Coupe";
		}
		if (value.contains("lexus-es-350")) {
			bodyType = "Sedan";
		}
		if (value.contains("volkswagen-beetle")) {
			bodyType = "Coupe";
		}
		if (value.contains("acura-csx")) {
			bodyType = "Sedan";
		}
		if (value.contains("mini-cooper-countryman")) {
			bodyType = "Hatch";
		}
		if (value.contains("gmc-sierra-3500")) {
			bodyType = "Truck";
		}
		if (value.contains("mercedes-benz-cls-class")) {
			bodyType = "Coupe";
		}
		if (value.contains("volkswagen-passat-cc")) {
			bodyType = "Sedan";
		}
		if (value.contains("audi-a6")) {
			bodyType = "Sedan";
		}
		if (value.contains("jeep-liberty")) {
			bodyType = "SUV";
		}
		if (value.contains("sea-doo-rxp")) {
			bodyType = "Jet-Ski";
		}
		if (value.contains("hyundai-genesis")) {
			bodyType = "Sedan";
		}
		if (value.contains("hyundai-elantra-touring")) {
			bodyType = "Wagon";
		}
		if (value.contains("bmw-328i")) {
			bodyType = "Sedan";
		}
		if (value.contains("mazda-mazda5")) {
			bodyType = "Sedan";
		}
		if (value.contains("maserati-quattroporte")) {
			bodyType = "Sedan";
		}
		if (value.contains("kia-rondo")) {
			bodyType = "Hatch";
		}
		if (value.contains("toyota-prius")) {
			bodyType = "Hybrid/Electric";
		}
		if (value.contains("cadillac-escalade-esv")) {
			bodyType = "SUV";
		}
		if (value.contains("lapalma-monaco")) {
			bodyType = "RV";
		}
		if (value.contains("chevrolet-express")) {
			bodyType = "Van";
		}
		if (value.contains("gmc-yukon")) {
			bodyType = "SUV";
		}
		if (value.contains("audi-a5")) {
			bodyType = "Sedan";
		}
		if (value.contains("mci-j4500")) {
			bodyType = "Bus";
		}
		if (value.contains("ford-taurus")) {
			bodyType = "Sedan";
		}
		if (value.contains("acura-tsx")) {
			bodyType = "Sedan";
		}
		if (value.contains("gmc-canyon")) {
			bodyType = "Truck";
		}
		if (value.contains("honda-fit")) {
			bodyType = "Hatch";
		}
		if (value.contains("volkswagen-golf-wagon")) {
			bodyType = "Wagon";
		}
		if (value.contains("ram-2500")) {
			bodyType = "Truck";
		}
		if (value.contains("mazda-mazda6")) {
			bodyType = "Sedan";
		}
		if (value.contains("shasta-sprite-zo")) {
			bodyType = "RV";
		}
		if (value.contains("chrysler-aspen")) {
			bodyType = "SUV";
		}
		if (value.contains("honda-s2000")) {
			bodyType = "Coupe";
		}
		if (value.contains("chevrolet-aveo")) {
			bodyType = "Sedan";
		}
		if (value.contains("volvo-xc90")) {
			bodyType = "SUV";
		}
		if (value.contains("jeep-tj")) {
			bodyType = "SUV";
		}
		if (value.contains("kia-rio")) {
			bodyType = "Hatch";
		}
		if (value.contains("tesla-model-3")) {
			bodyType = "Hybrid/Electric";
		}
		if (value.contains("infiniti-q50")) {
			bodyType = "Sedan";
		}
		if (value.contains("mitsubishi-eclipse")) {
			bodyType = "Crossover";
		}
		if (value.contains("harley-davidson-1200-custom")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("nissan-titan")) {
			bodyType = "Truck";
		}
		if (value.contains("chevrolet-traverse")) {
			bodyType = "SUV";
		}
		if (value.contains("cadillac-srx")) {
			bodyType = "Crossover";
		}
		if (value.contains("nissan-370z")) {
			bodyType = "Coupe";
		}
		if (value.contains("subaru-xv-crosstrek")) {
			bodyType = "Crossover";
		}
		if (value.contains("kia-telluride")) {
			bodyType = "SUV";
		}
		if (value.contains("alfa-romeo-giulia")) {
			bodyType = "Sedan";
		}
		if (value.contains("chevrolet-sonic")) {
			bodyType = "Sedan";
		}
		if (value.contains("nissan-micra")) {
			bodyType = "Hatch";
		}
		if (value.contains("mazda-miata-mx-5")) {
			bodyType = "Coupe";
		}
		if (value.contains("dodge-dart")) {
			bodyType = "Sedan";
		}
		if (value.contains("acura-tlx")) {
			bodyType = "Sedan";
		}
		if (value.contains("dodge-ram")) {
			bodyType = "Truck";
		}
		if (value.contains("mercedes-benz-clk")) {
			bodyType = "Coupe";
		}
		if (value.contains("dodge-ram-2500")) {
			bodyType = "Truck";
		}
		if (value.contains("infiniti-g35")) {
			bodyType = "Coupe";
		}
		if (value.contains("jaguar-xf")) {
			bodyType = "Sedan";
		}
		if (value.contains("hyundai-veloster")) {
			bodyType = "Hatch";
		}
		if (value.contains("chevrolet-cobalt")) {
			bodyType = "Sedan";
		}
		if (value.contains("subaru-legacy")) {
			bodyType = "Sedan";
		}
		if (value.contains("chevrolet-colorado")) {
			bodyType = "Truck";
		}
		if (value.contains("audi-s4")) {
			bodyType = "Sedan";
		}
		if (value.contains("chevrolet-tahoe")) {
			bodyType = "SUV";
		}
		if (value.contains("smart-fortwo")) {
			bodyType = "Coupe";
		}
		if (value.contains("tesla-model-s")) {
			bodyType = "Hybrid/Electric";
		}
		if (value.contains("ford-flex")) {
			bodyType = "Crossover";
		}
		if (value.contains("lexus-is-300")) {
			bodyType = "Sedan";
		}
		if (value.contains("mazda-cx-9")) {
			bodyType = "SUV";
		}
		if (value.contains("harley-davidson-dyna-wide-glide")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("ford-crown-victoria")) {
			bodyType = "Sedan";
		}
		if (value.contains("dodge-dakota")) {
			bodyType = "Truck";
		}
		if (value.contains("chrysler-200")) {
			bodyType = "Sedan";
		}
		if (value.contains("buick-enclave")) {
			bodyType = "Crossover";
		}
		if (value.contains("chrysler-town--country")) {
			bodyType = "Minivan";
		}
		if (value.contains("nissan-maxima")) {
			bodyType = "Sedan";
		}
		if (value.contains("audi-tt")) {
			bodyType = "Coupe";
		}
		if (value.contains("land-rover-discovery")) {
			bodyType = "SUV";
		}
		if (value.contains("honda-cbr600rr")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("ford-expedition")) {
			bodyType = "SUV";
		}
		if (value.contains("subaru-impreza-wrx-sti")) {
			bodyType = "Sedan";
		}
		if (value.contains("lexus-is-350")) {
			bodyType = "Sedan";
		}
		if (value.contains("volkswagen-gti")) {
			bodyType = "Hatch";
		}
		if (value.contains("land-rover-lr2")) {
			bodyType = "Crossover";
		}
		if (value.contains("nissan-juke")) {
			bodyType = "Crossover";
		}
		if (value.contains("lexus-nx-200t")) {
			bodyType = "Crossover";
		}
		if (value.contains("hummer-h3")) {
			bodyType = "SUV";
		}
		if (value.contains("acura-ilx")) {
			bodyType = "Sedan";
		}
		if (value.contains("winnebago-grand-tour")) {
			bodyType = "Bus";
		}
		if (value.contains("dodge-viper")) {
			bodyType = "Coupe";
		}
		if (value.contains("range-rover-evoque")) {
			bodyType = "SUV";
		}
		if (value.contains("kia-stinger")) {
			bodyType = "Sedan";
		}
		if (value.contains("kia-sedona")) {
			bodyType = "Minivan";
		}
		if (value.contains("infiniti-fx35")) {
			bodyType = "Crossover";
		}
		if (value.contains("arctic-cat-4x4-500")) {
			bodyType = "ATV";
		}
		if (value.contains("nissan-x-trail")) {
			bodyType = "Crossover";
		}
		if (value.contains("nissan-skyline")) {
			bodyType = "Coupe";
		}
		if (value.contains("toyota-fj-cruiser")) {
			bodyType = "Crossover";
		}
		if (value.contains("jeep-renegade")) {
			bodyType = "SUV";
		}
		if (value.contains("honda-hr-v")) {
			bodyType = "Crossover";
		}
		if (value.contains("mercedes-benz-m-class")) {
			bodyType = "SUV";
		}
		if (value.contains("dodge-nitro")) {
			bodyType = "SUV";
		}
		if (value.contains("land-rover-range-rover-velar")) {
			bodyType = "SUV";
		}
		if (value.contains("cadillac-xts")) {
			bodyType = "SUV";
		}
		if (value.contains("jaguar-f-type")) {
			bodyType = "Coupe";
		}
		if (value.contains("chevrolet-trax")) {
			bodyType = "Crossover";
		}
		if (value.contains("bmw-m5")) {
			bodyType = "Sedan";
		}
		if (value.contains("pontiac-g5")) {
			bodyType = "Coupe";
		}
		if (value.contains("lincoln-navigator")) {
			bodyType = "SUV";
		}
		if (value.contains("ram-promaster")) {
			bodyType = "Van";
		}
		if (value.contains("land-rover-range-rover-evoque-convertible")) {
			bodyType = "Crossover";
		}
		if (value.contains("ford-e350")) {
			bodyType = "Van";
		}
		if (value.contains("chevrolet-suburban")) {
			bodyType = "SUV";
		}
		if (value.contains("buick-regal")) {
			bodyType = "Sedan";
		}
		if (value.contains("infiniti-g25x")) {
			bodyType = "Sedan";
		}
		if (value.contains("ford-econoline")) {
			bodyType = "Van";
		}
		if (value.contains("honda-ridgeline")) {
			bodyType = "Truck";
		}
		if (value.contains("bmw-1-series")) {
			bodyType = "Hatch";
		}
		if (value.contains("chevrolet-spark")) {
			bodyType = "Hatch";
		}
		if (value.contains("land-rover-range-rover-sport-superchaged")) {
			bodyType = "SUV";
		}
		if (value.contains("sportscoach-cross-country-376ds")) {
			bodyType = "RV";
		}
		if (value.contains("mazda-cx-3")) {
			bodyType = "Crossover";
		}
		if (value.contains("ford-e450")) {
			bodyType = "Truck";
		}
		if (value.contains("pontiac-vibe")) {
			bodyType = "Hatch";
		}
		if (value.contains("chevrolet-silverado-1500-ls-cheyenne-edition")) {
			bodyType = "Truck";
		}
		if (value.contains("harley-davidson-ultra-classic-electra-glide")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("bmw-r")) {
			bodyType = "Motorcycle";
		}
		if (value.contains("subaru-forester-xt")) {
			bodyType = "Crossover";
		}
		if (value.contains("kia-forte5")) {
			bodyType = "Hatch";
		}
		if (value.contains("ford-e250")) {
			bodyType = "Van";
		}
		if (value.contains("hyundai-kona")) {
			bodyType = "Crossover";
		}
		if (value.contains("bmw-m4")) {
			bodyType = "Coupe";
		}
		if (value.contains("mercedes-benz-c320s")) {
			bodyType = "Sedan";
		}
		if (value.contains("john-deere-4200")) {
			bodyType = "Tractor";
		}
		if (value.contains("nissan-nv-2500")) {
			bodyType = "Van";
		}
		if (value.contains("ford-f-550")) {
			bodyType = "Truck";
		}
		if (value.contains("sun-valley-apache-865se")) {
			bodyType = "Trailer";
		}
		if (value.contains("pontiac-solstice")) {
			bodyType = "Convertible";
		}
		if (value.contains("argo-frontier")) {
			bodyType = "Tank";
		}
		if (value.contains("hummer-h1")) {
			bodyType = "SUV";
		}
		if (value.contains("mazda-tribute")) {
			bodyType = "Crossover";
		}
		if (value.contains("jaguar-f-pace")) {
			bodyType = "Crossover";
		}
		if (value.contains("porsche-panamera")) {
			bodyType = "Wagon";
		}
		if (value.contains("toyota-celica")) {
			bodyType = "Coupe";
		}
	}
}
